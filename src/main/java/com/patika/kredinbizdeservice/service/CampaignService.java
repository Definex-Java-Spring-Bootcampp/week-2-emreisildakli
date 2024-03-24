package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.repository.CampaignRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CampaignService {

    private CampaignRepository campaignRepository = new CampaignRepository();

    public Campaign save(Campaign campaign) {
        campaignRepository.save(campaign);

        return campaign;
    }

    public List<Campaign> getAll() {
        return campaignRepository.getAll();
    }

    public List<Campaign> getAllSortedByRecency() {
        return campaignRepository
                .getAll()
                .stream()
                .sorted(Comparator.comparing(Campaign::getCreateDate).reversed())
                .toList();
    }
}

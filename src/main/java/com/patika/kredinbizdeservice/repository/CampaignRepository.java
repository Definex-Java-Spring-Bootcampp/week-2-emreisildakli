package com.patika.kredinbizdeservice.repository;


import com.patika.kredinbizdeservice.model.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignRepository {

    private ArrayList<Campaign> campaignList = new ArrayList<>();


    public void save(Campaign campaign) {
        if (!campaignList.contains(campaign)) {
            campaignList.add(campaign);
        }
    }

    public List<Campaign> getAll() {
        return this.campaignList;
    }


}

package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.BankRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BankService {

    private BankRepository bankRepository = new BankRepository();

    public Bank save(Bank bank) {
        Bank foundBank = getByName(bank.getName());

        if (foundBank == null) {
            bankRepository.save(bank);
        }
        return bank;
    }


    public CreditCard addCreditCardToBank(String bankName, CreditCard card) {
        Bank bank = getByName(bankName);

        if (bank != null) {
            bankRepository.saveCard(bankName, card);
        }

        return card;
    }

    public Bank getByName(String bankName) {
        Optional<Bank> foundBank = bankRepository.findByName(bankName);

        Bank bank = null;

        if (foundBank.isPresent()) {
            bank = foundBank.get();
        }

        return bank;
    }

    public List<Bank> getAll() {
        return bankRepository.getAllBanks();
    }
}

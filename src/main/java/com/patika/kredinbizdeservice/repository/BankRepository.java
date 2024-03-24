package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankRepository {

    private ArrayList<Bank> bankList = new ArrayList<>();

    public void save(Bank bank) {
        bankList.add(bank);
    }


    public Optional<Bank> findByName(String bankName) {
        return bankList.stream().filter(bank -> bank.getName().equals(bankName)).findFirst();
    }

    public void saveCard(String bankName, CreditCard card) {
        ArrayList<Bank> updatedList = new ArrayList<>();
        bankList.stream().forEach(bank -> {
            if (bank.getName().equals(bankName)) {
                bank.addCreditCard(card);
            }
            updatedList.add(bank);
        });

        bankList = updatedList;
    }

    public List<Bank> getAllBanks() {
        return bankList;
    }
}

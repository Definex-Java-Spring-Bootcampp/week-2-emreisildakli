package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping
    public List<Bank> getAll() {
        return bankService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bank create(@RequestBody Bank bank) {
        return bankService.save(bank);
    }

    @PostMapping("/{bankName}/credit-card")
    @ResponseStatus(HttpStatus.OK)
    public CreditCard createCard(@PathVariable String bankName, @RequestBody CreditCard card) {
        return bankService.addCreditCardToBank(bankName, card);
    }


}

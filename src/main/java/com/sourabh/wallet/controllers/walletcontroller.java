package com.sourabh.wallet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sourabh.wallet.Entities.FormContainer;
import com.sourabh.wallet.Entities.Users;
import com.sourabh.wallet.Services.WalletServices;

@RestController
public class walletcontroller {

    @Autowired
    private WalletServices WalletService;

    @GetMapping("/sampleuser")
    public Users showSampleUser() {

        return this.WalletService.showSampleUser();
    }

    @PostMapping("/signup")
    public Users createUser(@RequestBody Users newuser) {

        return this.WalletService.createUser(newuser);
    }

    @GetMapping("/sampleloginform")
    public FormContainer showSampleLoginForm() {

        return this.WalletService.showSampleLoginForm();
    }

    @GetMapping("/checkbalance")
    public long balanceCheck() {

        return this.WalletService.balanceCheck();
    }

    @PostMapping("/credit")
    public long Credit(@RequestBody long creditAmount) {

        return this.WalletService.Credit(creditAmount);
    }

    @PostMapping("/debit")
    public long Debit(@RequestBody long debitAmount) {

        return this.WalletService.Debit(debitAmount);
    }

}

package com.sourabh.wallet.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sourabh.wallet.Entities.FormContainer;
import com.sourabh.wallet.Entities.Users;

@Service
public class WalletServiceImplem implements WalletServices {

    FormContainer sampleform = new FormContainer(999, "0pass");
    // //FormContainer idpass;
    // List<FormContainer> formlist;
    List<Users> Userlist;
    Users currentUser = null;
    long creditAmount;
    long debitAmount;
    public String err = "Wrong Credentials";
    String loginsuccess;

    public WalletServiceImplem() {
        Userlist = new ArrayList<>();
        Userlist.add(new Users(0, "defaultuser", "default", 11111));
        // formlist = new ArrayList<>();
        // formlist.add(new FormContainer(999, "0pass"));
    }

    public Users createUser(Users newuser) {
        Userlist.add(newuser);
        currentUser = newuser;
        System.out.println("User Created: ");
        return newuser;
    }

    public long balanceCheck() {

        System.out.println("Current Balance: ");
        return currentUser.getBalance();
    }

    public long Credit(long creditAmount) {
        long temp = currentUser.getBalance();
        long finalbalance = temp + creditAmount;
        currentUser.setBalance(finalbalance);
        System.out.println("Updated Balance = ");
        return currentUser.getBalance();
    }

    public long Debit(long debitAmount) {
        long temp = currentUser.getBalance();
        long finalbalance = temp - debitAmount;
        currentUser.setBalance(finalbalance);
        System.out.println("Updated Balance = ");
        return currentUser.getBalance();
    }

    public Users showSampleUser() {

        return Userlist.get(0);
    }

    public FormContainer showSampleLoginForm() {
        // String sample = "{ userId:0,password:\"default\"}";
        System.out.println("A sample User: ");
        return sampleform;
    }

}

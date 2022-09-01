package com.sourabh.wallet.Services;

import com.sourabh.wallet.Entities.FormContainer;
import com.sourabh.wallet.Entities.Users;

public interface WalletServices {

    public Users createUser(Users newuser);

    public Users showSampleUser();

    public FormContainer showSampleLoginForm();

    public long balanceCheck();

    public long Credit(long creditAmount);

    public long Debit(long debitAmount);

}

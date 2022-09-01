package com.sourabh.wallet.Entities;

public class Users {
    private int userId;
    private String userName;
    private String password;
    private long Balance;

    public Users(int userId, String userName, String password, long Balance) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.Balance = Balance;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance) {
        Balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Users [Balance=" + Balance + ", password=" + password + ", userId=" + userId + ", userName=" + userName
                + "]";
    }

}

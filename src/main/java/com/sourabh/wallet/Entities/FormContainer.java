package com.sourabh.wallet.Entities;

public class FormContainer {
    private int id;
    private String pass;

    public FormContainer(int id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}

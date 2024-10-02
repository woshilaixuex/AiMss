package com.example.aimss.data.model;

import android.provider.ContactsContract;

public class Message {
    private Integer CliId;
    private String Value;
    private ContactsContract.Data data;

    public Integer getCliId() {
        return CliId;
    }

    public void setCliId(Integer cliId) {
        CliId = cliId;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public ContactsContract.Data getData() {
        return data;
    }

    public void setData(ContactsContract.Data data) {
        this.data = data;
    }


}

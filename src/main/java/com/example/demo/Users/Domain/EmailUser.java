package com.example.demo.Users.Domain;

import com.example.demo.Shared.Domain.StringValueObject;

public class EmailUser extends StringValueObject{

    public EmailUser(String value) {
        super(value);
    }

    public EmailUser() {
        super("");
    }
}

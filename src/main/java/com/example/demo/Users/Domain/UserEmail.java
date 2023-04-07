package com.example.demo.Users.Domain;

import com.example.demo.Shared.Domain.StringValueObject;

public class UserEmail extends StringValueObject{

    public UserEmail(String value) {
        super(value);
    }

    public UserEmail() {
        super("");
    }
}

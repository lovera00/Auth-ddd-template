package com.example.demo.Users.Domain;

import com.example.demo.Shared.Domain.StringValueObject;

public class UserUsername extends StringValueObject {

    public UserUsername(String value) {
        super(value);
    }

    public UserUsername() {
        super("");
    }
}

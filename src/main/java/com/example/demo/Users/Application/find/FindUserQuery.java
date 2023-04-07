package com.example.demo.Users.Application.find;

import com.example.demo.Shared.Domain.Bus.Query.Query;

public class FindUserQuery implements Query{
    private final String id;

    public FindUserQuery(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}

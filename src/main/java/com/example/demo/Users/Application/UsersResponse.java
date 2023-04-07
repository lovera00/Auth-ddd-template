package com.example.demo.Users.Application;

import com.example.demo.Shared.Domain.Bus.Query.Response;

import java.util.List;

public final class UsersResponse implements Response {

    private final List<UserResponse> users;

    public UsersResponse(List<UserResponse> users) {
        this.users = users;
    }

    public List<UserResponse> users() {
        return users;
    }
    
}

package com.example.demo.Users.Application;

import com.example.demo.Shared.Domain.Bus.Query.Response;
import com.example.demo.Users.Domain.User;

public final class UserResponse implements Response {
    private final String id;
    private final String username;
    private final String email;

    public UserResponse(String id, String username, String email) {
        this.id       = id;
        this.username     = username;
        this.email = email;
    }

    public static UserResponse fromAggregate(User user) {
        return new UserResponse(
            user.getId().value(),
            user.getUsername().value(),
            user.getEmail().value()
        );
    }

    public String id() {
        return id;
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

}

package com.example.demo.Users.Application.create;

import com.example.demo.Shared.Domain.Bus.Command.Command;

public final class CreateUserCommand implements Command {
    private final String id;
    private final String username;
    private final String email;

    public CreateUserCommand(String id, String username, String email) {
        this.id       = id;
        this.username     = username;
        this.email = email;
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

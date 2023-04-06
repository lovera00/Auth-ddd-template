package com.example.demo.Users.Domain;

import com.example.demo.Shared.Domain.DomainError;

public class UserNotExist extends DomainError {

    public UserNotExist(UserId id) {
        super("user_not_exist", String.format("The user <%s> not exist", id.value()));
    }    
}

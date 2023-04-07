package com.example.demo.Users.Domain;

import com.example.demo.Shared.Domain.AggregateRoot;
import com.example.demo.Shared.Domain.User.UserCreatedDomainEvent;

import java.util.Objects;

public class User extends AggregateRoot {
    private UserId id;
    private UserUsername username;
    private UserEmail email;
    public User(UserId id, UserUsername username, UserEmail email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public static User create(UserId id, UserUsername username, UserEmail email) {
        User user = new User(id, username, email);
        user.record(new UserCreatedDomainEvent(id.value(), username.value(), email.value()));
        return user;
    }



    public UserId getId() {
        return id;
    }

    public UserUsername getUsername() {
        return username;
    }

    public UserEmail getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id.equals(user.id) &&
               username.equals(user.username) &&
               email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email);
    }
}

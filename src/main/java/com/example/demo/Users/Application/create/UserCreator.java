package com.example.demo.Users.Application.create;

import com.example.demo.Shared.Domain.Service;
import com.example.demo.Shared.Domain.Bus.Event.EventBus;
import com.example.demo.Users.Domain.UserEmail;
import com.example.demo.Users.Domain.User;
import com.example.demo.Users.Domain.UserId;
import com.example.demo.Users.Domain.UserRepository;
import com.example.demo.Users.Domain.UserUsername;

@Service
public final class UserCreator {
    private final UserRepository repository;
    private final EventBus         eventBus;

    public UserCreator(UserRepository repository, EventBus eventBus) {
        this.repository = repository;
        this.eventBus   = eventBus;
    }

    public void create(UserId id, UserUsername username, UserEmail email) {
        User course = User.create(id, username, email);
        repository.save(course);
        eventBus.publish(course.pullDomainEvents());
    }
}

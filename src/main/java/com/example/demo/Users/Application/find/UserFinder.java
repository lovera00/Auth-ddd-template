package com.example.demo.Users.Application.find;

import com.example.demo.Shared.Domain.Service;
import com.example.demo.Users.Application.UserResponse;
import com.example.demo.Users.Domain.UserId;
import com.example.demo.Users.Domain.UserNotExist;
import com.example.demo.Users.Domain.UserRepository;

@Service
public class UserFinder {
    private final UserRepository repository;

    public UserFinder(UserRepository repository) {
        this.repository = repository;
    }

    public UserResponse find(UserId id) throws UserNotExist {
        return repository.search(id)
            .map(UserResponse::fromAggregate)
            .orElse(null);
    }
}

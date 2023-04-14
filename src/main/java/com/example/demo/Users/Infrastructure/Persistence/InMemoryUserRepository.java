package com.example.demo.Users.Infrastructure.Persistence;

import com.example.demo.Shared.Domain.Criteria.Criteria;
import com.example.demo.Users.Domain.User;
import com.example.demo.Users.Domain.UserId;
import com.example.demo.Users.Domain.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class InMemoryUserRepository implements UserRepository {
    private HashMap<String, User> Users = new HashMap<>();

    @Override
    public void save(User user) {
        Users.put(user.getId().value(), user);
    }

    public Optional<User> search(UserId id) {
        return Optional.ofNullable(Users.get(id.value()));
    }

    @Override
    public List<User> matching(Criteria criteria) {
        return null;
    }
}

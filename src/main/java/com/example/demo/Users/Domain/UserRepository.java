package com.example.demo.Users.Domain;

import java.util.List;
import java.util.Optional;

import com.example.demo.Shared.Domain.Criteria.Criteria;

public interface UserRepository {
    void save(User course);

    Optional<User> search(UserId id);

    List<User> matching(Criteria criteria);
}

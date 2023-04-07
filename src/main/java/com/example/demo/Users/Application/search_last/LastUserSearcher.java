package com.example.demo.Users.Application.search_last;

import java.util.Optional;
import java.util.stream.Collectors;

import com.example.demo.Shared.Domain.Criteria.Criteria;
import com.example.demo.Shared.Domain.Criteria.Filters;
import com.example.demo.Shared.Domain.Criteria.Order;
import com.example.demo.Users.Application.UserResponse;
import com.example.demo.Users.Application.UsersResponse;
import com.example.demo.Users.Domain.UserRepository;

public class LastUserSearcher {
    private final UserRepository repository;

    public LastUserSearcher(UserRepository repository) {
        this.repository = repository;
    }

    public UsersResponse search(int users) {
        Criteria criteria = new Criteria(
            Filters.none(),
            Order.none(),
            Optional.of(users),
            Optional.empty()
        );

        return new UsersResponse(
            repository.matching(criteria).stream()
                .map(UserResponse::fromAggregate)
                .collect(Collectors.toList())
        );
    }
}

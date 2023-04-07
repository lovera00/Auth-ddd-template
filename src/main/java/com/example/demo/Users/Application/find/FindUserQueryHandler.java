package com.example.demo.Users.Application.find;

import com.example.demo.Shared.Domain.Bus.Query.QueryHandler;
import com.example.demo.Users.Application.UserResponse;
import com.example.demo.Users.Domain.UserId;
import com.example.demo.Users.Domain.UserNotExist;

public class FindUserQueryHandler implements QueryHandler<FindUserQuery, UserResponse>  {
    
    private final UserFinder finder;

    public FindUserQueryHandler(UserFinder finder) {
        this.finder = finder;
    }

    @Override
    public UserResponse handle(FindUserQuery query) throws UserNotExist {
        return finder.find(new UserId(query.id()));
    }
}

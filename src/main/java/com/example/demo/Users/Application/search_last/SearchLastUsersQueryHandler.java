package com.example.demo.Users.Application.search_last;

import com.example.demo.Shared.Domain.Bus.Query.QueryHandler;
import com.example.demo.Users.Application.UsersResponse;

public class SearchLastUsersQueryHandler implements QueryHandler<SearchLastUsersQuery, UsersResponse> {
    private final LastUserSearcher searcher;

    public SearchLastUsersQueryHandler(LastUserSearcher searcher) {
        this.searcher = searcher;
    }

    @Override
    public UsersResponse handle(SearchLastUsersQuery query) {
        return searcher.search(query.total());
    }
}

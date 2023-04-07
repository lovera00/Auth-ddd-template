package com.example.demo.Users.Application.search_last;

import com.example.demo.Shared.Domain.Bus.Query.Query;

import java.util.Objects;

public class SearchLastUsersQuery implements Query{
    private final Integer total;

    public SearchLastUsersQuery(Integer total) {
        this.total = total;
    }

    public Integer total() {
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchLastUsersQuery that = (SearchLastUsersQuery) o;
        return total.equals(that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total);
    }
}

package com.example.demo.Shared.Domain.Bus.Query;

public interface QueryHandler<Q extends Query, R extends Response> {
    R handle(Q query);
}

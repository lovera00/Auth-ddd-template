package com.example.demo.Shared.Domain.Bus.Query;

public interface QueryBus {
    <R> R ask(Query query) throws QueryHandlerExecutionError;
}

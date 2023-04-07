package com.example.demo.Shared.Domain.Bus.Command;

public interface CommandBus {
    void dispatch(Command command) throws CommandHandlerExecutionError;
}

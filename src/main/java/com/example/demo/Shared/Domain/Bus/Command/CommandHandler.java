package com.example.demo.Shared.Domain.Bus.Command;

public interface CommandHandler<T extends Command> {
    void handle(T command);
}

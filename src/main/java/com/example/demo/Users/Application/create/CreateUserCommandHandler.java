package com.example.demo.Users.Application.create;

import com.example.demo.Shared.Domain.Service;
import com.example.demo.Shared.Domain.Bus.Command.CommandHandler;
import com.example.demo.Users.Domain.UserEmail;
import com.example.demo.Users.Domain.UserId;
import com.example.demo.Users.Domain.UserUsername;

@Service
public final class CreateUserCommandHandler implements CommandHandler<CreateUserCommand> {
    private final UserCreator creator;

    public CreateUserCommandHandler(UserCreator creator) {
        this.creator = creator;
    }

    @Override
    public void handle(CreateUserCommand command) {
        UserId       id       = new UserId(command.id());
        UserUsername     username     = new UserUsername(command.username());
        UserEmail email = new UserEmail(command.email());

        creator.create(id, username, email);
    }
    
}

package com.example.demo.Shared.Domain.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

import com.example.demo.Shared.Domain.Bus.Event.DomainEvent;

public class UserCreatedDomainEvent extends DomainEvent{
    private final String username;
    private final String email;

    public UserCreatedDomainEvent() {
        super(null);

        this.username     = null;
        this.email = null;
    }

    public UserCreatedDomainEvent(String aggregateId, String username, String email) {
        super(aggregateId);

        this.username     = username;
        this.email = email;
    }

    public UserCreatedDomainEvent(
        String aggregateId,
        String eventId,
        String occurredOn,
        String username,
        String email
    ) {
        super(aggregateId, eventId, occurredOn);

        this.username     = username;
        this.email = email;
    }

    @Override
    public String eventName() {
        return "usuario.created";
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<String, Serializable>() {{
            put("username", username);
            put("email", email);
        }};
    }

    @Override
    public UserCreatedDomainEvent fromPrimitives(
        String aggregateId,
        HashMap<String, Serializable> body,
        String eventId,
        String occurredOn
    ) {
        return new UserCreatedDomainEvent(
            aggregateId,
            eventId,
            occurredOn,
            (String) body.get("username"),
            (String) body.get("email")
        );
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserCreatedDomainEvent that = (UserCreatedDomainEvent) o;
        return username.equals(that.username) &&
               email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email);
    }
    
}

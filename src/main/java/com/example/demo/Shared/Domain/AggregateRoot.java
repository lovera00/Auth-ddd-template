package com.example.demo.Shared.Domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.demo.Shared.Domain.Bus.Event.DomainEvent;

public abstract class AggregateRoot {
    private List<DomainEvent> domainEvents = new ArrayList<>();

    final public List<DomainEvent> pullDomainEvents() {
        List<DomainEvent> events = domainEvents;

        domainEvents = Collections.emptyList();

        return events;
    }

    final protected void record(DomainEvent event) {
        domainEvents.add(event);
    }
}

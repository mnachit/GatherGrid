package com.example.javaeehelloworld.service;

import com.example.javaeehelloworld.repository.EventRepository;

public class EventService {

    private final EventRepository eventRepository;

    public EventService() {
        eventRepository = new EventRepository();
    }
}

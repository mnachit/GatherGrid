package com.example.javaeehelloworld.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EventRepository {

    private final EntityManagerFactory entityManagerFactory;

    public EventRepository() {
        entityManagerFactory= Persistence.createEntityManagerFactory("default");
    }




}

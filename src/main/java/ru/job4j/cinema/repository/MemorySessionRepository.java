package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Session;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class MemorySessionRepository implements SessionRepository {
    private static final MemorySessionRepository INSTANCE = new MemorySessionRepository();

    private MemorySessionRepository getInstance() {
        return INSTANCE;
    }

    @Override
    public Optional<Session> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Collection<Session> findAll() {
        return List.of();
    }
}

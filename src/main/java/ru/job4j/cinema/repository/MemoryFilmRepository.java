package ru.job4j.cinema.repository;

import ru.job4j.cinema.model.Film;

import java.util.*;

public class MemoryFilmRepository implements FilmRepository {
    private static final MemoryFilmRepository INSTANCE = new MemoryFilmRepository();
    private int nextId = 1;
    private final Map<Integer, Film> films = new HashMap<>();

    public MemoryFilmRepository() {
        save(new Film(0, "Терминатор"));
        save(new Film(0, "Рембо"));
        save(new Film(0, "Кровавый спорт"));
        save(new Film(0, "Чужой"));
    }

    public static MemoryFilmRepository getInstance() {
        return INSTANCE;
    }

    @Override
    public Optional<Film> findById(int id) {
        return Optional.of(films.get(id));
    }

    @Override
    public Collection<Film> findAll() {
        return films.values();
    }

    private void save(Film film) {
        film.setId(nextId++);
        films.put(film.getId(), film);
    }
}

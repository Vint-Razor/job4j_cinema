package ru.job4j.cinema.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Session {
    private int id;
    private LocalDateTime startTime;
    private Film film;

    public Session(int id, LocalDateTime startTime, Film film) {
        this.id = id;
        this.startTime = startTime;
        this.film = film;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Session session = (Session) o;
        return id == session.id && Objects.equals(startTime, session.startTime) && Objects.equals(film, session.film);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, film);
    }

    @Override
    public String toString() {
        return "Session{"
                + "id=" + id
                + ", startTime=" + startTime
                + ", film=" + film
                + '}';
    }
}

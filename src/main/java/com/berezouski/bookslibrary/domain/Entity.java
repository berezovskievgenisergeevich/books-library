package com.berezouski.bookslibrary.domain;

public class Entity extends EntityGeneral {
    private final int id;
    private final String name;

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Entity {" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

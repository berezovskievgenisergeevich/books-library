package com.berezouski.bookslibrary.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class Entity extends EntityGeneral {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Entity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Entity(String name) {
        this.name = name;
    }

    public Entity() {
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

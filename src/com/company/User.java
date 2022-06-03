package com.company;

public class User {

    private int id;
    private String name;

    public User(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return this.name == user.name && this.id == user.id;
    }

    @Override
    public String toString() {
        String string = "";
        string += "ID: " + this.id;
        string += "Name: " + this.name;
        return string;
    }
}

package com.company;

import java.util.ArrayList;

public class ControlUser {

    private ArrayList<User> users;

    public ControlUser() {
        users = new ArrayList<>();
    }

    //create
    public boolean add(User user) {
        if (!exists(user)) {
            users.add(user);
            return true;
        } else {
            return false;
        }

    }
    public int generateID() {
        int size = users.size();
        if (size == 0) {
            return 1;
        } else {
            return get(size - 1).getId() + 1;
        }
    }

    //read
    public boolean exists(User user) {
        for (User u : users) {
            if (u.equals(user)) {
                return true;
            }
        }
        return false;
    }
    public User get(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    public String show(int id) {
        return get(id).toString();
    }
    public String showAll() {
        String string = "";
        for (User user : users) {
            string += user.toString() + "\n";
        }
        return string;
    }
    public int size() {
        return users.size();
    }

    //update
    public boolean update(int id, User user) {
        User u = get(id);
        if (u != null) {
            users.set(users.indexOf(u), user);
            return true;
        }
        return false;
    }

    //delete
    public boolean remove(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }

}

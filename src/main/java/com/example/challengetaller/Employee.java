package com.example.challengetaller;

public class Employee {
    private String name;
    private String email;
    private boolean active;

    Employee(String name, String email, boolean active) {
        this.name = name;
        this.email = email;
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }
}

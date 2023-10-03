package com.example.TravelApp.entities.user;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Set;
import java.util.UUID;

@Table("users")
public class User {
    @PrimaryKey
    @Column("uuid")
    private UUID uuid = UUID.randomUUID();
    private String email;
    private String name;
    private String password;
    private String username;
    @Column("travel_preferences")
    private Set<String> travelPreferences;

    public User(String email, String name, String password, String username, Set<String> travelPreferences) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.username = username;
        this.travelPreferences = travelPreferences;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<String> getTravelPreferences() {
        return travelPreferences;
    }

    public void setTravelPreferences(Set<String> travelPreferences) {
        this.travelPreferences = travelPreferences;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", travelPreferences=" + travelPreferences +
                '}';
    }
}
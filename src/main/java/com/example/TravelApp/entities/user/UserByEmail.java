package com.example.TravelApp.entities.user;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("users_by_email")
public class UserByEmail {
    @PrimaryKey
    private String email;
    private UUID uuid;

    public UserByEmail(String email, UUID uuid) {
        this.email = email;
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}

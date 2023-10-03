package com.example.TravelApp.entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.*;

@Table("journal_entries")
public class JournalEntry {
    @PrimaryKey
    private UUID uuid = UUID.randomUUID();
    private Date date;
    private String description;
    private String location;
    private String title;
    private UUID tripId;
    private UUID userId;
    private List<String> photos;
    private Set<String> recommendations;
    private Set<String> tags;

    public JournalEntry(Date date, String description, String location, String title, UUID tripId, UUID userId, List<String> photos, Set<String> recommendations, Set<String> tags) {
        this.date = date;
        this.description = description;
        this.location = location;
        this.title = title;
        this.tripId = tripId;
        this.userId = userId;
        this.photos = photos;
        this.recommendations = recommendations;
        this.tags = tags;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getTripId() {
        return tripId;
    }

    public void setTripId(UUID tripId) {
        this.tripId = tripId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public Set<String> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(Set<String> recommendations) {
        this.recommendations = recommendations;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "JournalEntry{" +
                "uuid=" + uuid +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", tripId=" + tripId +
                ", userId=" + userId +
                ", photos=" + photos +
                ", recommendations=" + recommendations +
                ", tags=" + tags +
                '}';
    }
}
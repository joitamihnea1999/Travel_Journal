package com.example.TravelApp.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.UUID;
import java.math.BigDecimal;
import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;
import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.datastax.oss.driver.api.mapper.annotations.Table;
import com.datastax.oss.driver.api.mapper.annotations.GeneratedValue;

@Entity
@Table(name="journal_entries")
public class JournalEntry {
    @PartitionKey
    @GeneratedValue
    private UUID uuid;
    private Date date;
    private String description;
    private String location;
    private String title;
    @CqlName("trip_id")
    private UUID tripId;
    @CqlName("user_id")
    private UUID userId;
    private List<String> photos;
    private Set<String> recommendations;
    private Set<String> tags;

    // Getters, setters, and other methods...
}
package com.example.TravelApp.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Table("trips")
public class Trip {
    @PrimaryKey
    @Column("uuid")
    private UUID uuid = UUID.randomUUID();
    @Column("end_date")
    private LocalDate endDate;
    @Column("estimated_budget")
    private BigDecimal estimatedBudget;
    @Column("start_date")
    private Date startDate;
    private String title;
    @Column("travel_group")
    private UUID travelGroup;
    private Map<Date, String> itinerary;

    public Trip(LocalDate endDate, BigDecimal estimatedBudget, Date startDate, String title, UUID travelGroup, Map<Date, String> itinerary) {
        this.endDate = endDate;
        this.estimatedBudget = estimatedBudget;
        this.startDate = startDate;
        this.title = title;
        this.travelGroup = travelGroup;
        this.itinerary = itinerary;
    }

    public UUID getUuid() {
        return uuid;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(BigDecimal estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getTravelGroup() {
        return travelGroup;
    }

    public void setTravelGroup(UUID travelGroup) {
        this.travelGroup = travelGroup;
    }

    public Map<Date, String> getItinerary() {
        return itinerary;
    }

    public void setItinerary(Map<Date, String> itinerary) {
        this.itinerary = itinerary;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "uuid=" + uuid +
                ", endDate=" + endDate +
                ", estimatedBudget=" + estimatedBudget +
                ", startDate=" + startDate +
                ", title='" + title + '\'' +
                ", travelGroup=" + travelGroup +
                ", itinerary=" + itinerary +
                '}';
    }
}
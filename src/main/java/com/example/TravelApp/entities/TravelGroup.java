package com.example.TravelApp.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Set;
import java.util.UUID;

@Table("travel_groups")
public class TravelGroup {
    @PrimaryKey
    @Column("uuid")
    private UUID uuid = UUID.randomUUID();
    @Column("group_name")
    private String groupName;
    private Set<UUID> members;

    public TravelGroup(String groupName, Set<UUID> members) {
        this.groupName = groupName;
        this.members = members;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<UUID> getMembers() {
        return members;
    }

    public void setMembers(Set<UUID> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "TravelGroup{" +
                "uuid=" + uuid +
                ", groupName='" + groupName + '\'' +
                ", members=" + members +
                '}';
    }
}
package com.example.TravelApp.repositories;

import com.example.TravelApp.entities.user.UserByUsername;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserByUsernameRepository extends CassandraRepository<UserByUsername, String> {
}

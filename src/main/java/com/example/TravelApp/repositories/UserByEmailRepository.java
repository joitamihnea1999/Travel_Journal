package com.example.TravelApp.repositories;

import com.example.TravelApp.entities.user.UserByEmail;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserByEmailRepository extends CassandraRepository<UserByEmail, String> {
}

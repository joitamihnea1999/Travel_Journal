package com.example.TravelApp.repositories;

import com.example.TravelApp.entities.user.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CassandraRepository<User, UUID> {

    @Query("SELECT * FROM users WHERE email=?0 ALLOW FILTERING")
    User findByEmail(String email);

    @Query("SELECT * FROM users WHERE username=?0 ALLOW FILTERING")
    User findByUsername(String username);

}

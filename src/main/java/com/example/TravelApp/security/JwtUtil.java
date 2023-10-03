package com.example.TravelApp.security;

import io.jsonwebtoken.*;

public class JwtUtil {
    private static final String SECRET = "YourSecretKey";

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    }

    public static String getUsernameFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token.replace("Bearer ", ""))
                .getBody()
                .getSubject();
    }
}
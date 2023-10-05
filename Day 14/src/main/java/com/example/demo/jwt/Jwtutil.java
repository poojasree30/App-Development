package com.example.demo.jwt;

import java.sql.Date;

import com.example.demo.model.Userjwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Jwtutil {
	private static String securityKey = "VCCjuIfD65SriNthatDQCmfHaridgRb9GIXhoQlPBB7qhaRANcDJw1MeZ480fqe";

    public String generateToken(Userjwt u) 
    {
        long issueTime = System.currentTimeMillis();

        Date issueDate = new Date(issueTime);

        // claims
        Claims claims = Jwts.claims()
                .setIssuer(u.getUserName()+";"+u.getPassword())
                .setIssuedAt(issueDate);

        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, securityKey)
                .compact();
    }

    public String verify(String auth) {

        try {
            return Jwts
            		.parser()
            		.setSigningKey(securityKey)
            		.parseClaimsJws(auth)
            		.getBody().getIssuer();
        } 
        catch (Exception e) {
            return null;
        }

    }
}

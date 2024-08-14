package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}

package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

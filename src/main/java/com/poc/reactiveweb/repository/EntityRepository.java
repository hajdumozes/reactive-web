package com.poc.reactiveweb.repository;

import com.poc.reactiveweb.entity.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<Entity, Integer> {
}

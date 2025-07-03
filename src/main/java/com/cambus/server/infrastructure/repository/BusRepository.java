package com.cambus.server.infrastructure.repository;

import com.cambus.server.infrastructure.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}

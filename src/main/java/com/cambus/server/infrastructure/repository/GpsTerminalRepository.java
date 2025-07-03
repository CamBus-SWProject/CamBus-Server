package com.cambus.server.infrastructure.repository;

import com.cambus.server.infrastructure.model.GpsTerminal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GpsTerminalRepository extends JpaRepository<GpsTerminal, Long> {
}

package com.cambus.server.infrastructure.repository;

import com.cambus.server.infrastructure.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
}

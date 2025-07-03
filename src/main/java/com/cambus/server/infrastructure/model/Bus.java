package com.cambus.server.infrastructure.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "bus")
public class Bus extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private String number;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gps_terminal_id")
    private GpsTerminal gpsTerminal;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
}

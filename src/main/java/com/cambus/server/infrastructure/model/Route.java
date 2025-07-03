package com.cambus.server.infrastructure.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "route")
public class Route extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "school")
    private String school;

    @Column(name = "route")
    private String route;

    @OneToMany(mappedBy = "route", fetch = FetchType.LAZY)
    private List<Bus> buses = new ArrayList<>();
}

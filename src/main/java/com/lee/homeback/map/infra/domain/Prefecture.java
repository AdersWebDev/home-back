package com.lee.homeback.map.infra.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Prefecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

}

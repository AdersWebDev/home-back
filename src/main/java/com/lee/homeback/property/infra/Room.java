package com.lee.homeback.property.infra;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

}

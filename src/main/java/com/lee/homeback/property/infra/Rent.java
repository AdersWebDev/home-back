package com.lee.homeback.property.infra;

import com.lee.homeback.map.infra.domain.Prefecture;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private Long user_id;
    private String name;
    private String kana;
    private String postCode;
    @ManyToOne()
    private Prefecture prefecture;
    private String address;

}

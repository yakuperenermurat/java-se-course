package com.yakuperenermurat.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "ADDRESS")

public class Address {

// many to many
    //List Set to List Set

    @ManyToMany(mappedBy = "addresses",fetch = FetchType.LAZY)
    Set<Customer> customers = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private Integer id;

    @Column(name = "COUNTRY", length = 50, nullable = false)
    private String country;

    @Column(name = "CITY", length = 55)
    private String city;

    @Column(name = "STREET")
    private String street;
}

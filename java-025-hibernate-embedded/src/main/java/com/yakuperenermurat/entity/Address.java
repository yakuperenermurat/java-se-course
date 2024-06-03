package com.yakuperenermurat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable

public class Address {


    @Column(name = "COUNTRY")
    private String country;
    private String city;
    private String state;

    @Column(name = "ZIP")
    private String zip;
}

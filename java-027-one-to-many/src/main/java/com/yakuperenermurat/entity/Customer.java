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
@Table(name = "CUSTOMERS")

public class Customer {

    @OneToMany(mappedBy = "customer",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    //private List<Order> orders = new ArrayList<Order>();
    private Set<Order> orders = new HashSet<Order>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 55)
    private String lastName;



}

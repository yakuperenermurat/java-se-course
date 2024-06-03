package com.yakuperenermurat.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "WORKERS")
public class Worker {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "F_NAME")
    private String firstName;

    @Column(name = "L_NAME")
    private String lastName;

    @Size(min = 18 , max = 99)
    @Column(name = "AGE")
    private int age;

    @Column(name = "PHONE")
    private String phone;

    @Email
    @Column(unique = true ,name = "EMAIL", nullable = false)
    private String email;

    @FutureOrPresent
    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREATE")
    private Date createDate;


    @Embedded
    private Address address ;




}

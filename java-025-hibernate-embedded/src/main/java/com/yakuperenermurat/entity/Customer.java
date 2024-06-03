package com.yakuperenermurat.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "CUSTOMERS")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int id;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 55)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_CREATE")
    private Date createDate;

    /*@Transient    //  Bu alan  tabloya kolon olarak eşlenmez!
    private String info ;
*/

    @Embedded
    private Address address ;



    private String phone;


    public Customer() {
    }

    public Customer( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
/*
    public void setId(int id) {
        this.id = id;
    }
*/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

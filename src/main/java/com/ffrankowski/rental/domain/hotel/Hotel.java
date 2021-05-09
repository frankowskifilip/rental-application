package com.ffrankowski.rental.domain.hotel;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue
    String id;

    private final String name;

    @Embedded
    private final Address address;

    Hotel(final String name, final Address address) {
        this.name = name;
        this.address = address;
    }
}

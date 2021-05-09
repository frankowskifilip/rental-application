package com.ffrankowski.rental.domain.apartment;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apartment {

    @Id
    @GeneratedValue
    private String id;
    private final String ownerId;

    @Embedded
    private final Address address;
    private final String description;

    @OneToMany
    private final List<Room> rooms;

    Apartment(final String ownerId, final Address address, final String description, final List<Room> rooms) {
        this.ownerId = ownerId;
        this.address = address;
        this.description = description;
        this.rooms = rooms;
    }
}

package com.ffrankowski.rental.domain.apartment;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
class Room {
    private final String name;

    @Embedded
    private final SquareMeter squareMeter;

    Room(final String name, final SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
}

package com.ffrankowski.rental.domain.hotelroom;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Space {

    @Id
    @GeneratedValue
    private Long id;

    private final String name;

    @Embedded
    private final SquareMeter squareMeter;

    Space(final String name, final SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
}

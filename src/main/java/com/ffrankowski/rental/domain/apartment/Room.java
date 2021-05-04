package com.ffrankowski.rental.domain.apartment;

class Room {
    private final String name;
    private final SquareMeter squareMeter;

    Room(final String name, final SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
}

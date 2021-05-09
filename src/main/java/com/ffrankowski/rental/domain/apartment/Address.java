package com.ffrankowski.rental.domain.apartment;

import javax.persistence.Embeddable;

@Embeddable
class Address {
    private final String street;
    private final String houseNumber;
    private final String apartmentNumber;
    private final String postalCode;
    private final String city;
    private final String country;

    Address(final String street, final String houseNumber, final String apartmentNumber,
                   final String postalCode, final String city, final String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}

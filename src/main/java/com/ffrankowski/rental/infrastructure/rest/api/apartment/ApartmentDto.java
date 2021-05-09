package com.ffrankowski.rental.infrastructure.rest.api.apartment;

import java.util.Map;

class ApartmentDto {

    private final String ownerId;
    private final String street;
    private final String houseNumber;
    private final String apartmentNumber;
    private final String postalCode;
    private final String city;
    private final String country;
    private final String description;
    private final Map<String, Double> roomsDefinition;

    ApartmentDto(final String ownerId, final String street, final String houseNumber, final String apartmentNumber,
                 final String postalCode, final String city, final String country, final String description,
                 final Map<String, Double> roomsDefinition) {
        this.ownerId = ownerId;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.description = description;
        this.roomsDefinition = roomsDefinition;
    }

    String getOwnerId() {
        return ownerId;
    }

    String getStreet() {
        return street;
    }

    String getHouseNumber() {
        return houseNumber;
    }

    String getApartmentNumber() {
        return apartmentNumber;
    }

    String getPostalCode() {
        return postalCode;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }

    String getDescription() {
        return description;
    }

    Map<String, Double> getRoomsDefinition() {
        return roomsDefinition;
    }
}

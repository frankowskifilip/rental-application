package com.ffrankowski.rental.domain.apartment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApartmentFactory {
    public Apartment create(final String ownerId, final String street, final String houseNumber,
                            final String apartmentNumber, final String postalCode,
                            final String city, final String country, final String description,
                            final Map<String, Double> roomsDefinition) {

        Address address = new Address(street, houseNumber, apartmentNumber, postalCode, city, country);
        List<Room> rooms = new ArrayList<>();
        roomsDefinition.forEach((name, size) -> {
            SquareMeter squareMeter = new SquareMeter(size);
            rooms.add(new Room(name, squareMeter));
        });
        return new Apartment(ownerId, address, description, rooms);
    }
}

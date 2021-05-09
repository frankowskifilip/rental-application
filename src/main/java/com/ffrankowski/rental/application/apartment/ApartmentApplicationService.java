package com.ffrankowski.rental.application.apartment;

import com.ffrankowski.rental.domain.apartment.Apartment;
import com.ffrankowski.rental.domain.apartment.ApartmentFactory;
import com.ffrankowski.rental.domain.apartment.ApartmentRepository;

import java.util.Map;

public class ApartmentApplicationService {

    private final ApartmentRepository apartmentRepository;

    public ApartmentApplicationService(final ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public void add(String ownerId, String street, String houseNumber, String apartmentNumber,
                    String postalCode, String city, String country, String description,
                    Map<String, Double> roomsDefinition ) {

        Apartment apartment = new ApartmentFactory().create(ownerId, street, houseNumber, apartmentNumber, postalCode, city, country, description, roomsDefinition);
        apartmentRepository.save(apartment);
    }
}

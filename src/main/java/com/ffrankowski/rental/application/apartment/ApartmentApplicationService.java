package com.ffrankowski.rental.application.apartment;

import com.ffrankowski.rental.domain.apartment.Apartment;
import com.ffrankowski.rental.domain.apartment.ApartmentFactory;
import com.ffrankowski.rental.domain.apartment.ApartmentRepository;
import com.ffrankowski.rental.domain.apartment.Period;
import com.ffrankowski.rental.domain.eventchannel.EventChannel;

import java.time.LocalDate;
import java.util.Map;

public class ApartmentApplicationService {

    private final ApartmentRepository apartmentRepository;
    private final EventChannel eventChannel;

    public ApartmentApplicationService(final ApartmentRepository apartmentRepository, final EventChannel eventChannel) {
        this.apartmentRepository = apartmentRepository;
        this.eventChannel = eventChannel;
    }

    public void add(String ownerId, String street, String houseNumber, String apartmentNumber,
                    String postalCode, String city, String country, String description,
                    Map<String, Double> roomsDefinition ) {

        Apartment apartment = new ApartmentFactory().create(ownerId, street, houseNumber, apartmentNumber, postalCode, city, country, description, roomsDefinition);
        apartmentRepository.save(apartment);
    }

    public void book(final String id, final String tenantId, final LocalDate start, final LocalDate end) {
        Apartment apartment = apartmentRepository.findById(id);
        Period period = new Period(start,end);
        apartment.book(tenantId, period, eventChannel);
    }
}

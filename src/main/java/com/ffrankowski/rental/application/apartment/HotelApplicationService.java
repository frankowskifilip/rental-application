package com.ffrankowski.rental.application.apartment;

import com.ffrankowski.rental.domain.hotel.Hotel;
import com.ffrankowski.rental.domain.hotel.HotelFactory;
import com.ffrankowski.rental.domain.hotel.HotelRepository;

public class HotelApplicationService {

    private final HotelRepository hotelRepository;

    public HotelApplicationService(final HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void addHotel(String name, String street, String buildingNumber,
                         String postalCode, String city, String country) {

        Hotel hotel = new HotelFactory().create(name, street, buildingNumber, postalCode, city, country);
        hotelRepository.save(hotel);
    }
}

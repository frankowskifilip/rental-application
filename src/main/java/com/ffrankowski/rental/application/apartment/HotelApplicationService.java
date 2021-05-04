package com.ffrankowski.rental.application.apartment;

import com.ffrankowski.rental.domain.hotel.Hotel;
import com.ffrankowski.rental.domain.hotel.HotelFactory;

public class HotelApplicationService {

    public void addHotel(String name, String street, String buildingNumber,
                         String postalCode, String city, String country) {

        Hotel hotel = new HotelFactory().create(name, street, buildingNumber, postalCode, city, country);
    }
}

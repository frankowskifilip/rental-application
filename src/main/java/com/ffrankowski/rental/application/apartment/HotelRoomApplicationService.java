package com.ffrankowski.rental.application.apartment;

import com.ffrankowski.rental.domain.hotelroom.HotelRoom;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomFactory;

import java.util.Map;

public class HotelRoomApplicationService {

    public void add(String hotelId, int number, String description,
                        Map<String, Double> spacesDefinition) {
        HotelRoom hotel = new HotelRoomFactory().create(hotelId, number, description, spacesDefinition);
    }
}

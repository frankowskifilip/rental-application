package com.ffrankowski.rental.application.hotelroom;

import com.ffrankowski.rental.domain.hotelroom.HotelRoom;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomFactory;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomRepository;

import java.util.Map;

public class HotelRoomApplicationService {

    private final HotelRoomRepository hotelRoomRepository;

    public HotelRoomApplicationService(final HotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    public void add(String hotelId, int number, String description,
                    Map<String, Double> spacesDefinition) {
        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, description, spacesDefinition);
        hotelRoomRepository.save(hotelRoom);
    }
}


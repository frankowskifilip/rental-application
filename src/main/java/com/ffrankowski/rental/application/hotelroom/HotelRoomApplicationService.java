package com.ffrankowski.rental.application.hotelroom;

import com.ffrankowski.rental.domain.eventchannel.EventChannel;
import com.ffrankowski.rental.domain.hotelroom.HotelRoom;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomFactory;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class HotelRoomApplicationService {

    private final HotelRoomRepository hotelRoomRepository;
    private final EventChannel eventChannel;

    public HotelRoomApplicationService(final HotelRoomRepository hotelRoomRepository, final EventChannel eventChannel) {
        this.hotelRoomRepository = hotelRoomRepository;
        this.eventChannel = eventChannel;
    }

    public void add(final String hotelId, int number, final String description,
                    final Map<String, Double> spacesDefinition) {
        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, description, spacesDefinition);
        hotelRoomRepository.save(hotelRoom);
    }

    public void book(final String hotelRoomId, final String tenantId, final List<LocalDate> dates) {
        final HotelRoom hotelRoom = hotelRoomRepository.findById(hotelRoomId);
        hotelRoom.book(tenantId, dates, eventChannel);
    }
}


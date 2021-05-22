package com.ffrankowski.rental.domain.eventchannel;

import com.ffrankowski.rental.domain.apartment.ApartmentBooked;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomBooked;

public interface EventChannel {
    void publish(final HotelRoomBooked hotelRoomBooked);
    void publish(final ApartmentBooked apartmentBooked);
}

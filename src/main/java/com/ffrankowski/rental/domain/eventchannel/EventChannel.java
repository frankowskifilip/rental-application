package com.ffrankowski.rental.domain.eventchannel;

import com.ffrankowski.rental.domain.apartment.ApartmentBooked;

public interface EventChannel {
    void publish(final ApartmentBooked apartmentBooked);
}

package com.ffrankowski.rental.infrastructure.eventchannel.spring;

import com.ffrankowski.rental.domain.apartment.ApartmentBooked;
import com.ffrankowski.rental.domain.eventchannel.EventChannel;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomBooked;
import org.springframework.context.ApplicationEventPublisher;

class SpringEventChannel implements EventChannel {

    private final ApplicationEventPublisher applicationEventPublisher;

    SpringEventChannel(final ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void publish(final HotelRoomBooked hotelRoomBooked) {
        applicationEventPublisher.publishEvent(hotelRoomBooked);
    }

    @Override
    public void publish(final ApartmentBooked apartmentBooked) {
        applicationEventPublisher.publishEvent(apartmentBooked);
    }
}

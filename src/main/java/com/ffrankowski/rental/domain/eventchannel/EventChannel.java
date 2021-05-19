package com.ffrankowski.rental.domain.eventchannel;

public interface EventChannel {
    void publish(final Event apartmentBooked);
}

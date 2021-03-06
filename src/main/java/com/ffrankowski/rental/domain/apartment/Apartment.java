package com.ffrankowski.rental.domain.apartment;

import com.ffrankowski.rental.domain.eventchannel.EventChannel;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apartment {

    @Id
    @GeneratedValue
    private String id;
    private final String ownerId;

    @Embedded
    private final Address address;
    private final String description;

    @OneToMany
    private final List<Room> rooms;

    Apartment(final String ownerId, final Address address, final String description, final List<Room> rooms) {
        this.ownerId = ownerId;
        this.address = address;
        this.description = description;
        this.rooms = rooms;
    }

    public void book(final String tenantId, final Period period, final EventChannel eventChannel) {
        ApartmentBooked apartmentBooked = ApartmentBooked.create(id, ownerId, tenantId, period);
        eventChannel.publish(apartmentBooked);
    }
}

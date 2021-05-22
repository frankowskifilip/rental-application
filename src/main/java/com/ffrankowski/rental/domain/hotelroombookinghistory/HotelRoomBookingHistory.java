package com.ffrankowski.rental.domain.hotelroombookinghistory;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class HotelRoomBookingHistory {

    @Id
    private final String hotelRoomId;
    @OneToMany
    private final List<HotelRoomBooking> bookings = new ArrayList<>();

    public HotelRoomBookingHistory(final String hotelRoomId) {
        this.hotelRoomId = hotelRoomId;
    }

    public void add(final HotelRoomBooking hotelRoomBooking) {
        bookings.add(hotelRoomBooking);
    }
}

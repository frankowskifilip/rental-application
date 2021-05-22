package com.ffrankowski.rental.domain.hotelroombookinghistory;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class HotelRoomBooking {
    private final LocalDateTime bookingCreationDateTime;
    private final String tenantId;
    private final List<LocalDate> dates;
    private final BookingStep step;

    public HotelRoomBooking(final LocalDateTime bookingCreationDateTime, final String tenantId, final List<LocalDate> dates, final BookingStep step) {
        this.bookingCreationDateTime = bookingCreationDateTime;
        this.tenantId = tenantId;
        this.dates = dates;
        this.step = step;
    }

    public static HotelRoomBooking start(final LocalDateTime bookingCreationDateTime, final String tenantId, final List<LocalDate> dates) {
        BookingStep step = BookingStep.START;
        return new HotelRoomBooking(bookingCreationDateTime, tenantId, dates, step);
    }


}

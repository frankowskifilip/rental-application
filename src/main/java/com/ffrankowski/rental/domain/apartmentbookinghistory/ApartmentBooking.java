package com.ffrankowski.rental.domain.apartmentbookinghistory;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class ApartmentBooking {
    private final LocalDateTime bookingCreationDateTime;
    private final String ownerId;
    private final String tenantId;
    private final BookingStep bookingStep;

    @Embedded
    private final BookingPeriod bookingPeriod;


    public ApartmentBooking(final LocalDateTime bookingCreationDateTime, final String ownerId, final String tenantId,
                            final BookingPeriod bookingPeriod, final BookingStep bookingStep) {
        this.bookingCreationDateTime = bookingCreationDateTime;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.bookingPeriod = bookingPeriod;
        this.bookingStep = bookingStep;
    }

    public static ApartmentBooking start(final LocalDateTime bookingCreationDateTime, final String ownerId,
                                         final String tenantId, final LocalDate periodStart, final LocalDate periodEnd) {
        final BookingPeriod bookingPeriod = new BookingPeriod(periodStart, periodEnd);
        return new ApartmentBooking(bookingCreationDateTime, ownerId, tenantId, bookingPeriod, BookingStep.START);
    }
}

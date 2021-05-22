package com.ffrankowski.rental.domain.apartmentbookinghistory;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Embeddable
class BookingPeriod {
    private final LocalDate start;
    private final LocalDate end;

    BookingPeriod(final LocalDate start, final LocalDate end) {
        this.start = start;
        this.end = end;
    }
}

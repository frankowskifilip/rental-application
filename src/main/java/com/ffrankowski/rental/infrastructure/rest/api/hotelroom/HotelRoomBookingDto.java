package com.ffrankowski.rental.infrastructure.rest.api.hotelroom;

import java.time.LocalDate;
import java.util.List;

class HotelRoomBookingDto {
    private final String tenantId;
    private final List<LocalDate> dates;

    HotelRoomBookingDto(final String tenantId, final List<LocalDate> dates) {
        this.tenantId = tenantId;
        this.dates = dates;
    }

    String getTenantId() {
        return tenantId;
    }

    List<LocalDate> getDates() {
        return dates;
    }
}

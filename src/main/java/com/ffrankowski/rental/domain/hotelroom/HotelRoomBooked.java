package com.ffrankowski.rental.domain.hotelroom;

import com.ffrankowski.rental.domain.eventchannel.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class HotelRoomBooked implements Event {

    private final String eventId;
    private final LocalDateTime eventCreationDateTime;
    private final String id;
    private final String hotelId;
    private final String tenantId;
    private final List<LocalDate> dates;

    public HotelRoomBooked(String eventId, LocalDateTime eventCreationDateTime, String id, String hotelId,
                           String tenantId, List<LocalDate> dates) {
        this.eventId = eventId;
        this.eventCreationDateTime = eventCreationDateTime;
        this.id = id;
        this.hotelId = hotelId;
        this.tenantId = tenantId;
        this.dates = dates;
    }

    public static HotelRoomBooked create(String id, String hotelId, String tenantId, List<LocalDate> dates) {
        var eventId = UUID.randomUUID().toString();
        var eventCreationDateTime = LocalDateTime.now();
        return new HotelRoomBooked(eventId, eventCreationDateTime, id, hotelId, tenantId, dates);
    }

    public String getEventId() {
        return eventId;
    }

    LocalDateTime getEventCreationDateTime() {
        return eventCreationDateTime;
    }

    public String getId() {
        return id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public List<LocalDate> getDates() {
        return dates;
    }
}
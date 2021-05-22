package com.ffrankowski.rental.application.hotelroom;

import com.ffrankowski.rental.domain.hotelroom.HotelRoomBooked;
import com.ffrankowski.rental.domain.hotelroombookinghistory.HotelRoomBooking;
import com.ffrankowski.rental.domain.hotelroombookinghistory.HotelRoomBookingHistory;
import com.ffrankowski.rental.domain.hotelroombookinghistory.HotelRoomBookingHistoryRepository;
import org.springframework.context.event.EventListener;

public class HotelRoomHistoryEventListener {

    private final HotelRoomBookingHistoryRepository hotelRoomBookingHistoryRepository;

    public HotelRoomHistoryEventListener(final HotelRoomBookingHistoryRepository hotelRoomBookingHistoryRepository) {
        this.hotelRoomBookingHistoryRepository = hotelRoomBookingHistoryRepository;
    }

    @EventListener
    public void consume(HotelRoomBooked hotelRoomBooked) {
        HotelRoomBookingHistory hotelRoomBookingHistory = getHotelRoomBookingHistoryFor(hotelRoomBooked.getId());

        hotelRoomBookingHistory.add(HotelRoomBooking.start(hotelRoomBooked.getEventCreationDateTime(),
                hotelRoomBooked.getTenantId(), hotelRoomBooked.getDates()));

        hotelRoomBookingHistoryRepository.save(hotelRoomBookingHistory);
    }

    private HotelRoomBookingHistory getHotelRoomBookingHistoryFor(final String hotelRoomId) {
        if (hotelRoomBookingHistoryRepository.existFor(hotelRoomId)) {
            return hotelRoomBookingHistoryRepository.findFor(hotelRoomId);
        } else {
            return new HotelRoomBookingHistory(hotelRoomId);
        }
    }
}

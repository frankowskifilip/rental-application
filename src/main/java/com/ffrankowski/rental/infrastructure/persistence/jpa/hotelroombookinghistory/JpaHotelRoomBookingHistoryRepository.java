package com.ffrankowski.rental.infrastructure.persistence.jpa.hotelroombookinghistory;

import com.ffrankowski.rental.domain.hotelroombookinghistory.HotelRoomBookingHistory;
import com.ffrankowski.rental.domain.hotelroombookinghistory.HotelRoomBookingHistoryRepository;

class JpaHotelRoomBookingHistoryRepository implements HotelRoomBookingHistoryRepository {

    private final SpringHotelRoomHistoryRepository springHotelRoomHistoryRepository;

    JpaHotelRoomBookingHistoryRepository(final SpringHotelRoomHistoryRepository springHotelRoomHistoryRepository) {
        this.springHotelRoomHistoryRepository = springHotelRoomHistoryRepository;
    }

    @Override
    public void save(final HotelRoomBookingHistory hotelRoomBookingHistory) {
        springHotelRoomHistoryRepository.save(hotelRoomBookingHistory);
    }

    @Override
    public boolean existFor(final String hotelRoomId) {
        return springHotelRoomHistoryRepository.existsById(hotelRoomId);
    }

    @Override
    public HotelRoomBookingHistory findFor(final String hotelRoomId) {
        return springHotelRoomHistoryRepository.findById(hotelRoomId).get();
    }
}

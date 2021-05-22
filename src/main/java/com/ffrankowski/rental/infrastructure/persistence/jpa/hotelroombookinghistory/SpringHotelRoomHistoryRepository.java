package com.ffrankowski.rental.infrastructure.persistence.jpa.hotelroombookinghistory;

import com.ffrankowski.rental.domain.hotelroombookinghistory.HotelRoomBookingHistory;
import org.springframework.data.repository.CrudRepository;

interface SpringHotelRoomHistoryRepository extends CrudRepository<HotelRoomBookingHistory, String> {
}

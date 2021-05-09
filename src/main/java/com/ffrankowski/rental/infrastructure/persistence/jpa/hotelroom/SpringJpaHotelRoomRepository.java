package com.ffrankowski.rental.infrastructure.persistence.jpa.hotelroom;

import com.ffrankowski.rental.domain.hotelroom.HotelRoom;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaHotelRoomRepository extends CrudRepository<HotelRoom, String> {
}

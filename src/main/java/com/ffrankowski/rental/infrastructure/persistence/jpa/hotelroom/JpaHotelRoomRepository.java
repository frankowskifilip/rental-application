package com.ffrankowski.rental.infrastructure.persistence.jpa.hotelroom;

import com.ffrankowski.rental.domain.hotelroom.HotelRoom;
import com.ffrankowski.rental.domain.hotelroom.HotelRoomRepository;

class JpaHotelRoomRepository implements HotelRoomRepository {
    private final SpringJpaHotelRoomRepository springJpaHotelRoomRepository;

    JpaHotelRoomRepository(final SpringJpaHotelRoomRepository springJpaHotelRoomRepository) {
        this.springJpaHotelRoomRepository = springJpaHotelRoomRepository;
    }

    @Override
    public void save(final HotelRoom hotelRoom) {
        springJpaHotelRoomRepository.save(hotelRoom);
    }
}

package com.ffrankowski.rental.infrastructure.persistence.jpa.hotel;

import com.ffrankowski.rental.domain.hotel.Hotel;
import com.ffrankowski.rental.domain.hotel.HotelRepository;

class JpaHotelRepository implements HotelRepository {

    private final SpringJpaHotelRepository springJpaHotelRepository;

    JpaHotelRepository(final SpringJpaHotelRepository springJpaHotelRepository) {
        this.springJpaHotelRepository = springJpaHotelRepository;
    }

    @Override
    public void save(final Hotel hotel) {
        springJpaHotelRepository.save(hotel);
    }
}

package com.ffrankowski.rental.infrastructure.persistence.jpa.hotel;

import com.ffrankowski.rental.domain.hotel.Hotel;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaHotelRepository extends CrudRepository<Hotel, String> {
}

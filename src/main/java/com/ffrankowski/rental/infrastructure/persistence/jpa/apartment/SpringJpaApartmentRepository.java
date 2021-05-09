package com.ffrankowski.rental.infrastructure.persistence.jpa.apartment;

import com.ffrankowski.rental.domain.apartment.Apartment;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaApartmentRepository extends CrudRepository<Apartment, String> {
}

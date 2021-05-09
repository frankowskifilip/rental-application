package com.ffrankowski.rental.infrastructure.persistence.jpa.apartment;

import com.ffrankowski.rental.domain.apartment.Apartment;
import com.ffrankowski.rental.domain.apartment.ApartmentRepository;

class JpaApartmentRepository implements ApartmentRepository {
    private final SpringJpaApartmentRepository springJpaApartmentRepository;

    JpaApartmentRepository(final SpringJpaApartmentRepository springJpaApartmentRepository) {
        this.springJpaApartmentRepository = springJpaApartmentRepository;
    }

    @Override
    public void save(final Apartment apartment) {
        springJpaApartmentRepository.save(apartment);
    }
}

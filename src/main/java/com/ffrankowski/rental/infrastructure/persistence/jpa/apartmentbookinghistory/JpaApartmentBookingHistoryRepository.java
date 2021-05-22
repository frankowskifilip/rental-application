package com.ffrankowski.rental.infrastructure.persistence.jpa.apartmentbookinghistory;

import com.ffrankowski.rental.domain.apartmentbookinghistory.ApartmentBookingHistory;
import com.ffrankowski.rental.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository;

class JpaApartmentBookingHistoryRepository implements ApartmentBookingHistoryRepository {

    private final SpringApartmentBookingHistoryRepository springApartmentBookingHistoryRepository;

    JpaApartmentBookingHistoryRepository(final SpringApartmentBookingHistoryRepository springApartmentBookingHistoryRepository) {
        this.springApartmentBookingHistoryRepository = springApartmentBookingHistoryRepository;
    }

    @Override
    public void save(final ApartmentBookingHistory apartmentBookingHistory) {
        springApartmentBookingHistoryRepository.save(apartmentBookingHistory);
    }

    @Override
    public boolean existFor(final String apartmentId) {
        return springApartmentBookingHistoryRepository.existsById(apartmentId);
    }

    @Override
    public ApartmentBookingHistory findFor(final String apartmentId) {
        return springApartmentBookingHistoryRepository.findById(apartmentId).get();
    }
}

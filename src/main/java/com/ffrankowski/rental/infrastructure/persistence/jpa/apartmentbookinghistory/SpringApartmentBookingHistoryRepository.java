package com.ffrankowski.rental.infrastructure.persistence.jpa.apartmentbookinghistory;

import com.ffrankowski.rental.domain.apartmentbookinghistory.ApartmentBookingHistory;
import org.springframework.data.repository.CrudRepository;

interface SpringApartmentBookingHistoryRepository extends CrudRepository<ApartmentBookingHistory, String> {
}

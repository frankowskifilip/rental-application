package com.ffrankowski.rental.domain.apartmentbookinghistory;

public interface ApartmentBookingHistoryRepository {

    void save(ApartmentBookingHistory apartmentBookingHistory);
    boolean existFor(String apartmentId);
    ApartmentBookingHistory findFor(String apartmentId);
}

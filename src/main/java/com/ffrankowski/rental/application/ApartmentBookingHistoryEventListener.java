package com.ffrankowski.rental.application;

import com.ffrankowski.rental.domain.apartment.ApartmentBooked;
import com.ffrankowski.rental.domain.apartmentbookinghistory.ApartmentBooking;
import com.ffrankowski.rental.domain.apartmentbookinghistory.ApartmentBookingHistory;
import com.ffrankowski.rental.domain.apartmentbookinghistory.ApartmentBookingHistoryRepository;
import org.springframework.context.event.EventListener;

public class ApartmentBookingHistoryEventListener {

    private final ApartmentBookingHistoryRepository apartmentBookingHistoryRepository;

    public ApartmentBookingHistoryEventListener(final ApartmentBookingHistoryRepository apartmentBookingHistoryRepository) {
        this.apartmentBookingHistoryRepository = apartmentBookingHistoryRepository;
    }

    @EventListener
    public void consume(ApartmentBooked apartmentBooked) {
        ApartmentBookingHistory apartmentBookingHistory = getApartmentBookingHistoryFor(apartmentBooked.getApartmentId());

        apartmentBookingHistory.add(ApartmentBooking.start(
               apartmentBooked.getEventCreationDateTime(), apartmentBooked.getOwnerId(), apartmentBooked.getTenantId(),
                apartmentBooked.getPeriodStart(), apartmentBooked.getPeriodEnd()));

        apartmentBookingHistoryRepository.save(apartmentBookingHistory);
    }

    private ApartmentBookingHistory getApartmentBookingHistoryFor(final String apartmentId) {
        if(apartmentBookingHistoryRepository.existFor(apartmentId)) {
            return apartmentBookingHistoryRepository.findFor(apartmentId);
        } else {
            return new ApartmentBookingHistory(apartmentId);
        }
    }
}

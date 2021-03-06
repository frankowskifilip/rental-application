package com.ffrankowski.rental.infrastructure.rest.api.apartment;

import com.ffrankowski.rental.application.apartment.ApartmentApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("apartment")
public class ApartmentRestController {

    private final ApartmentApplicationService apartmentApplicationService;

    ApartmentRestController(final ApartmentApplicationService apartmentApplicationService) {
        this.apartmentApplicationService = apartmentApplicationService;
    }

    @PostMapping
    public void add(@RequestBody ApartmentDto apartmentDto) {
        apartmentApplicationService.add(apartmentDto.getOwnerId(), apartmentDto.getStreet(),
                apartmentDto.getHouseNumber(), apartmentDto.getApartmentNumber(), apartmentDto.getPostalCode(),
                apartmentDto.getCity(), apartmentDto.getCountry(), apartmentDto.getDescription(),
                apartmentDto.getRoomsDefinition());
    }

    @PutMapping("book/{id}")
    public void book(@PathVariable String id, ApartmentBookingDto apartmentBookingDto) {
        apartmentApplicationService.book(id, apartmentBookingDto.getTenantId(), apartmentBookingDto.getStart(),
                apartmentBookingDto.getEnd());
    }
}

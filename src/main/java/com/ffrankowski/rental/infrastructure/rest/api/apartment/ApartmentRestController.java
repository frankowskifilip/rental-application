package com.ffrankowski.rental.infrastructure.rest.api.apartment;

import com.ffrankowski.rental.application.apartment.ApartmentApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apartment")
class ApartmentRestController {

    private final ApartmentApplicationService apartmentApplicationService;

    ApartmentRestController(final ApartmentApplicationService apartmentApplicationService) {
        this.apartmentApplicationService = apartmentApplicationService;
    }

    @PostMapping
    void add(@RequestBody ApartmentDto apartmentDto) {
        apartmentApplicationService.add(apartmentDto.getOwnerId(), apartmentDto.getStreet(),
                apartmentDto.getHouseNumber(), apartmentDto.getApartmentNumber(), apartmentDto.getPostalCode(),
                apartmentDto.getCity(), apartmentDto.getCountry(), apartmentDto.getDescription(),
                apartmentDto.getRoomsDefinition());
    }
}

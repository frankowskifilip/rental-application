package com.ffrankowski.rental.infrastructure.rest.api.hotel;

import com.ffrankowski.rental.application.apartment.HotelApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hotel")
class HotelRestController {

    private final HotelApplicationService hotelApplicationService;

    HotelRestController(final HotelApplicationService hotelApplicationService) {
        this.hotelApplicationService = hotelApplicationService;
    }

    @PostMapping
    void add(@RequestBody HotelDto hotelDto){
        hotelApplicationService.add(hotelDto.getName(), hotelDto.getStreet(), hotelDto.getBuildingNumber(),
                hotelDto.getPostalCode(), hotelDto.getCity(), hotelDto.getCountry());
    }
}

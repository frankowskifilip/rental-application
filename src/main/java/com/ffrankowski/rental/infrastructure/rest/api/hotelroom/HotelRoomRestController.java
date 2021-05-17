package com.ffrankowski.rental.infrastructure.rest.api.hotelroom;

import com.ffrankowski.rental.application.hotel.HotelApplicationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hotelroom")
public class HotelRoomRestController {

    private final HotelApplicationService hotelApplicationService;


    public HotelRoomRestController(final HotelApplicationService hotelApplicationService) {
        this.hotelApplicationService = hotelApplicationService;
    }

    @PostMapping
    public void add(@RequestBody HotelRoomDto hotelRoomDto) {
        hotelApplicationService.add(hotelRoomDto.getName(), hotelRoomDto.getStreet(), hotelRoomDto.getBuildingNumber(),
                hotelRoomDto.getPostalCode(), hotelRoomDto.getCity(), hotelRoomDto.getCountry());
    }
}

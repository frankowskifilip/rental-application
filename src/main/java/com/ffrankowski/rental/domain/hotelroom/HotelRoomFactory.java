package com.ffrankowski.rental.domain.hotelroom;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelRoomFactory {

    public HotelRoom create(final String hotelId, final int number, final String description,
                            final Map<String, Double> spacesDefinition) {

        List<Space> spaces = spacesDefinition.entrySet().stream()
                .map(entry -> {
                    SquareMeter squareMeter = new SquareMeter(entry.getValue());
                    return new Space(entry.getKey(), squareMeter);
                })
                .collect(Collectors.toList());

        return new HotelRoom(hotelId, number, description, spaces);
    }
}

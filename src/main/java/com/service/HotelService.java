package com.service;

import com.domain.Hotel;

import java.util.List;

public interface HotelService {
    void addHotel(Hotel hotel);
    List<Hotel> getHotels();
    Hotel getHotel(int id);
}

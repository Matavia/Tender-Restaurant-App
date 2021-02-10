package com.techelevator.reservations.dao;

import java.util.List;

import com.techelevator.reservations.models.Hotel;

public interface HotelDAO {

    List<Hotel> list();

    void create(Hotel hotel);

    Hotel get(int id);

}
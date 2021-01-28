package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;

import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class HotelController {

    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;

    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    
    //How we set up routes - Interpret it as a web url
    // When you send a GET Request and the URL points to /hotels, it automatically runs this method
    //Building controllers - ignore the root URL Spring knows the root URL
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDAO.get(id);
    }
    
    
    
    //List all Reservations - need to be public for the annotations to work
    // @return all info for any reservation in the system
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations(){
    	return this.reservationDAO.findAll();
    }
     //Get a reservation by id
    @RequestMapping (path ="/reservations/{reservationID}", method = RequestMethod.GET)
    public Reservation getReservationById(@PathVariable int reservationID) {
    	return this.reservationDAO.get(reservationID);
    }
     
    // list all reservations for a hotel
    
    @RequestMapping (path = "/hotels/{hotelID}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationByHotel(@PathVariable int hotelID){
    	return this.reservationDAO.findByHotel(hotelID);
    
    }
    
    //TODO add a new reservation
    
    //TODO filter the hotels by state and/or city
    public List<Hotel> filterHotelByStateOrCity(@PathVariable String state, String city){
    List<Hotel> filteredHotels = new ArrayList<>();
    
    for(Hotel hotel : allHotels) {
    	if(city != null) {
    		if(hotel.getAddress() != null && hotel)
    	}
    }
    }
}

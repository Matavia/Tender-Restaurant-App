package com.techelevator.services;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Recipe;
import com.techelevator.models.Review;

import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private RestTemplate restTemplate = new RestTemplate();

    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;
    }

    public Hotel[] listHotels() {
    	String requestUrl = API_BASE_URL + "hotels";
    	return restTemplate.getForObject(requestUrl, Hotel[].class);
    }
    

    public Review[] listReviews() {
        return restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
    }

    public Hotel getHotelById(int id) {
    	String requestUrl = API_BASE_URL + "hotels/" + id;
        return restTemplate.getForObject(requestUrl, Hotel.class);
    }

    public Review[] getReviewsByHotelId(int hotelID) {
        return restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelID + "/reviews", Review[].class);
    }

    public Hotel[] getHotelsByStarRating(int stars) {
    	// ? is called a query string
    	// they are formatted like this
    	// ?key=value&key1=value1&key2=value2
    	String requestUrl = API_BASE_URL + "hotels?stars=" + stars;
        return restTemplate.getForObject(requestUrl, Hotel[].class);
    }

    public City getWithCustomQuery(){
        return restTemplate.getForObject("https://api.teleport.org/api/cities/geonameid:5128581/", City.class);
    }
   
    public JSONObject getRecipe() {
    
    	String key = "X-RapidAPI-Key";
    	String value = "2f6d2ed807msh787eb9d6c92d10dp18f7c6jsnaa67257ae5f7";
    	HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add(key, value);
		HttpEntity entity = new HttpEntity<>(headers);
		
		
    	String url = "https://edamam-recipe-search.p.rapidapi.com/search?q=mushroom,kale,onion,garlic,broth";
    	
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity,String.class);
	
    	
    	
    	return null;
    	
    }

}

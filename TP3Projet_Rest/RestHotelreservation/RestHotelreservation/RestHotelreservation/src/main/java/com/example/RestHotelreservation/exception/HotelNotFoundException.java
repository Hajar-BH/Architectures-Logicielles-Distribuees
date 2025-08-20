package com.example.RestHotelreservation.exception;


public class HotelNotFoundException extends HotelException {
	public HotelNotFoundException() {}
    public HotelNotFoundException(String message) {
        super(message);
    }
}
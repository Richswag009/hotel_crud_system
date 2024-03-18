package com.richcodes.services;

import com.richcodes.dto.Hotel;
import com.richcodes.dto.HotelDataAccessService;
import com.richcodes.dto.HotelRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    public  final HotelDataAccessService hotelDa0;

    public HotelService(HotelDataAccessService hotelDa0) {
        this.hotelDa0 = hotelDa0;
    }

    public List<Hotel> getAllHotel(){
        return hotelDa0.getAllHotels();
    }


    public void saveHotel(HotelRequest hotel){
        Hotel hotels = new Hotel(
                hotel.price(),
                hotel.roomNumber()
                ,hotel.roomType()
        );
         hotelDa0.saveHotel(hotels);
    }
}

package com.richcodes.services;

import com.richcodes.dto.Hotel;
import com.richcodes.dto.HotelDataAccessService;
import com.richcodes.dto.HotelRequest;
import com.richcodes.exceptions.RequestValidationException;
import com.richcodes.exceptions.ResourceNotFound;
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

    public Hotel getHotelByID(Integer id){
        return hotelDa0.getHotelById(id).orElseThrow(
                ()-> new ResourceNotFound("hotel wasnt found")
        );
    }


    public void saveHotel(HotelRequest hotel){
        Hotel hotels = new Hotel(
                hotel.price(),
                hotel.roomNumber()
                ,hotel.roomType()
        );
         hotelDa0.saveHotel(hotels);
    }


    public void deleteHotelById(Integer id)
    {
        if(hotelDa0.getHotelById(id).isEmpty()){
            throw new ResourceNotFound("customer wasnt found");
        }
        hotelDa0.deleteHotel(id);
    }

    public void updateHotelById(Integer id, HotelRequest request){
        Hotel hotel = getHotelByID(id);
        boolean changes = false;

        if (Double.compare(request.price(), 0.0) != 0 && request.price() != hotel.getPrice()) {
            hotel.setPrice(request.price());
            changes = true;
        }

        if (request.roomNumber() != null && !request.roomNumber().equals(hotel.getRoomNumber())){
            hotel.setRoomNumber(request.roomNumber());
            changes=true;
        }
        if (request.roomType() != null && !request.roomType().equals(hotel.getRoomType())){
            hotel.setRoomType(request.roomType());
            changes=true;
        }
        if(!changes){
            throw  new RequestValidationException("cannot");
        }
        hotelDa0.updateHotel(hotel);
    }


}

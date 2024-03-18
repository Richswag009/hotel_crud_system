package com.richcodes.controller;

import com.richcodes.dto.Hotel;
import com.richcodes.dto.HotelRequest;
import com.richcodes.services.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/hotel")
public class HotelController {

    public final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    @GetMapping()
    public List<Hotel> getHotels(){
        return hotelService.getAllHotel();
    }

    @PostMapping("/add")
        public String addHotel(@RequestBody HotelRequest hotel){
        hotelService.saveHotel(hotel);
        return "new Student added";
    }

}

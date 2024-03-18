package com.richcodes.dto;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fake")
public interface HotelDao {
    List<Hotel> getAllHotels();
    Optional<Hotel> getHotelById(Integer hotelId);
}

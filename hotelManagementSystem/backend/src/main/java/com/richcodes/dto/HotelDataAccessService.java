package com.richcodes.dto;

import com.richcodes.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HotelDataAccessService implements HotelDao{

    @Autowired
    public  final HotelRepository hotelRepository;

    public HotelDataAccessService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<Hotel> getAllHotels() {
       return  hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> getHotelById(Integer hotelId) {
        return hotelRepository.findById(hotelId);
    }

    @Override
    public void saveHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(Integer id) {
        hotelRepository.deleteById(id);
    }

    public  void updateHotel(Hotel update){
        hotelRepository.save(update);
    }
}

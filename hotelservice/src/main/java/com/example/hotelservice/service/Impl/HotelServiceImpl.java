package com.example.hotelservice.service.Impl;

import com.example.hotelservice.HotelserviceApplication;
import com.example.hotelservice.dto.HotelRequest;
import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.repository.HotelRepository;
import com.example.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public void createHotel(HotelRequest hotelRequest) {

        Hotel hotel = new Hotel();
        hotel.setAbout(hotelRequest.getAbout());
        hotel.setName(hotelRequest.getName());
        hotel.setAddress(hotelRequest.getAddress());

        hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Integer id) {
        return hotelRepository.findById(id).orElseThrow(()->new RuntimeException("No Hotel Found"));
    }

    @Override
    public void deleteHotel(Integer Id) {
        Optional<Hotel> optionalHotel = hotelRepository.findById(Id);

        if (!optionalHotel.isPresent()){
            throw new RuntimeException("Hotel Not Found");
        }

        Hotel hotel = optionalHotel.get();

        hotelRepository.deleteById(hotel.getHotelId());
    }
}
package com.example.demo.Entity.Houses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    @Autowired
    HouseRepository repository;

    //get Methods
    public HouseEntity getHouseById(Long id){
        return repository.findById(id).orElse(null);
    }
    public List<HouseEntity> getHouses(){
        return repository.findAll();
    }
    public List<HouseEntity> findHouseByAddress(String address){
        return repository.findByAddress(address);
    }

    //Post methods
    public HouseEntity postHouse(HouseEntity h){
        return repository.save(h);
    }
    public List<HouseEntity> postHouses(List<HouseEntity> h){
        return repository.saveAll(h);
    }
    //Delete method
    public String deleteHouse(Long id){
        repository.deleteById(id);
        return "";
    }
    //Put method
    public HouseEntity putHouse(Long id,HouseEntity s){
        HouseEntity House=repository.findById(id).orElse(null);
        House.setAddress(s.getAddress());
        House.setPrice(s.getPrice());
        House.setSpace(s.getSpace());
        House.setBedrooms(s.getBedrooms());
        House.setEquipment(s.getEquipment());
        House.setState(s.getState());

        return repository.save(House);
    }

}

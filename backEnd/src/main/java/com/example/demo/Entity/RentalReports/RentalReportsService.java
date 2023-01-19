package com.example.demo.Entity.RentalReports;

import com.example.demo.Entity.Houses.HouseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalReportsService {
    @Autowired
    RentalReportsRepository repository;
    //get moethods
    public RentalReports getById(Long id){
        return repository.findById(id).orElse(null);
    }
    public List<RentalReports> getAllReports(){
        return repository.findAll();
    }
    //post methods
    public RentalReports postReport(RentalReports r){
        return repository.save(r);
    }
}

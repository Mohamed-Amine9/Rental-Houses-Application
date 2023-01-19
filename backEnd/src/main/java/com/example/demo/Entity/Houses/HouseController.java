package com.example.demo.Entity.Houses;

import com.example.demo.Entity.RentalReports.RentalReports;
import com.example.demo.Entity.RentalReports.RentalReportsService;
import com.example.demo.registration.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration/token={token}")
public class HouseController {
    @Autowired
    HouseService service;
    @Autowired
    RegistrationService RService;
    @Autowired
    RentalReportsService reportsService;

   /* public String lien(){
        return RService.getLien();
    }*/
   // public String link=lien();
    //get methods
    @GetMapping("/getById/{id}")
    public HouseEntity getHousetById(@PathVariable Long id){
        return service.getHouseById(id);
    }

    @GetMapping("/getAll")
    public List<HouseEntity> getStudents(){
        return service.getHouses();
    }

    @GetMapping("/recherche")
    public List<HouseEntity> findStudentByNom(@RequestParam String address){
        return service.findHouseByAddress(address);
    }
    @GetMapping("/getReports")
    public List<RentalReports> getReports(){
        return reportsService.getAllReports();
    }


    //Post methods
    @PostMapping("/Add")
    public HouseEntity postHouse(@RequestBody HouseEntity h){
        return service.postHouse(h);
    }
    @PostMapping("/addAll")
    public List<HouseEntity> postHouses(@RequestBody List<HouseEntity> h){
        return service.postHouses(h);
    }
    //post Methods
    @PostMapping("/confirm")
    public RentalReports postReport(@RequestBody RentalReports r){
        return reportsService.postReport(r);
    }
    //delete method
    @DeleteMapping("/deleteHouse/{id}")
    public String deleteHouse(@PathVariable Long id){
        return service.deleteHouse(id);
    }
    //put method
    @PutMapping("/updateHouse/{id}")
    public HouseEntity putHouse(@PathVariable Long id,@RequestBody HouseEntity h){
        return service.putHouse(id,h);
    }


}

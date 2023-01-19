package com.example.demo.Entity.RentalReports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/registration/token={token}")
public class RentalReportsController {

    @Autowired
    RentalReportsService service;
    //get methods
    @GetMapping("/getReportById/{id}")
    public RentalReports getStudentById(@PathVariable Long id){
        return service.getById(id);
    }




}

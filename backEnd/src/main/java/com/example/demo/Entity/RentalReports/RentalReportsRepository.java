package com.example.demo.Entity.RentalReports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
public interface RentalReportsRepository extends JpaRepository<RentalReports,Long> {
}

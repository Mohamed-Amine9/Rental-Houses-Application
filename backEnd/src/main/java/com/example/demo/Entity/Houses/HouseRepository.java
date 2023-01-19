package com.example.demo.Entity.Houses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin
public interface HouseRepository extends JpaRepository<HouseEntity,Long> {
    List<HouseEntity> findByAddress(String address);
}

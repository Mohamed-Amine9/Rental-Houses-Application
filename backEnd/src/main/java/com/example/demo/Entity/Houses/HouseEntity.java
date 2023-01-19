package com.example.demo.Entity.Houses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "Houses")
@Entity
public class HouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="address ")
    private String address ;
    @Column(name="price")
    private float price;
    @Column(name="space")
    private float space;
    @Column(name="bedrooms")
    private int bedrooms;
    @Column(name="equipment")
    private Boolean equipment;
    @Column(name="state")
    private Boolean state;
}

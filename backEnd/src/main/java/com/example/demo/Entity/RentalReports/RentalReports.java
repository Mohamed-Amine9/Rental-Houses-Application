package com.example.demo.Entity.RentalReports;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigInteger;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "rentalReports")
@Entity
public class RentalReports {

    @Id
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="tel")
    private Long tel;
    @Column(name = "price")
    private float price;
    @Column(name = "CIN")
    private Long cin;
    @Column(name="Address")
    private String address;
    @Column(name="Confirmation")
    private Boolean confirmation;

}

package com.example.university.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "store", catalog = "warehouse")
public class Store {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String zip;
}

package com.example.week4homeworkrest.pojo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "providers")
public class Provider{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    public Long id;

    @Column(nullable = false, unique = false, length = 100)
    public String first_name;

    @Column(nullable = false, unique = false, length = 100)
    public String last_name;

    @Column(nullable = true, length = 100)
    public String middle_name;

    @Column(nullable = false)
    public String dob;
}

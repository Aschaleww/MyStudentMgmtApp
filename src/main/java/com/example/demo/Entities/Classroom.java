package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long classRoomId;
    private String buildingName;
    private int roomNumber;

    @ManyToOne
    private Student student;


    public Classroom(String buildingName, int roomNumber) {
    }
}

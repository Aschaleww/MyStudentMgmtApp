package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Transcript {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long TranscriptId;
    private String degreeTitle;
    @OneToOne(mappedBy = "transcript")
    private Student student;


    public Transcript(String degreeTitle) {
    }
}

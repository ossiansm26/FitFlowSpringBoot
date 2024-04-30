package com.ossian.FitFlow.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="collectionExercices")
public class CollectionExercices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "collectionName", nullable = false)
    private String collectionName;
    @Column(name = "difficultyLevel")
    private int difficultyLevel;
    @Column(name = "totalExercices")
    private int totalExercices;
    @Column(name = "urlExplanatoryVideo")
    private String urlExplanatoryVideo;

    @JsonIgnore
    @ManyToMany(mappedBy = "exercicesCollection", cascade = CascadeType.ALL)
    List<Routine> routine= new ArrayList<>();

    @ManyToMany(mappedBy = "collectionExercices", cascade = CascadeType.ALL)
    List<Exercices> exercices= new ArrayList<>();

}

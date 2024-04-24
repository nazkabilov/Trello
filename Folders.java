package com.example.techordatrello.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Folders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

    //    @Column(name = "name", length = 200)
    private String name;

    @ManyToMany
//    @Column(name = "categories", length = 200)
    private List<TaskCategories> categories;
}
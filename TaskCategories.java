package com.example.techordatrello.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "taskcategories")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

    //    @Column(name = "name", length = 200)
    private String name;
}

package com.example.kanban.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String description;
    private LocalDate creationDate = LocalDate.now();
    private LocalDate dueDate;
    private String status = "A Fazer";
    private String priority = "baixa";
}

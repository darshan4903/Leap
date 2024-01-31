package com.example.Leap.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "todos_data")
public class Task {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String title;
    private String description;

    private String due_date;

    private boolean completed;


}

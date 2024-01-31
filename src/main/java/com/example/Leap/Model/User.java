package com.example.Leap.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_data")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String username;

    private String password;
}

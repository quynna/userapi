package com.example.userapi.modelo;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Usuario {
    
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String email;
    private String password;
    private LocalDateTime created = LocalDateTime.now();
    private LocalDateTime modified = LocalDateTime.now();
    private LocalDateTime lastLogin = LocalDateTime.now();
    private String token = UUID.randomUUID().toString();
    private boolean isActive = true;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Telefono> phones;
}

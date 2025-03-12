package com.example.userapi.modelo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Telefono {
    
    @Id
    @GeneratedValue
    private Long id;

    private String number;
    private String citycode;
    private String contrycode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Usuario user;
}

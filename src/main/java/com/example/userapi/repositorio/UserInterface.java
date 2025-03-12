package com.example.userapi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userapi.modelo.Usuario;

import java.util.Optional;
import java.util.UUID;


public interface  UserInterface extends JpaRepository<Usuario, UUID> {
    Optional<Usuario> findByEmail(String email);
}

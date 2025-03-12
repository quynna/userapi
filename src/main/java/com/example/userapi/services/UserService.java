package com.example.userapi.services;

import com.example.userapi.modelo.Usuario;
import com.example.userapi.repositorio.UserInterface;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    private final UserInterface userRepository;

    public UserService(UserInterface userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<Usuario> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Usuario save(Usuario user) {
        return userRepository.save(user);
    }
}

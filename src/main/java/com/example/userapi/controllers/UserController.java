package com.example.userapi.controllers;


import com.example.userapi.modelo.Usuario;
import com.example.userapi.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Usuario user) {
        if (userService.findByEmail(user.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body("{\"mensaje\": \"El correo ya registrado\"}");
        }

        Usuario savedUser = userService.save(user);
        return ResponseEntity.ok(savedUser);
    }
}

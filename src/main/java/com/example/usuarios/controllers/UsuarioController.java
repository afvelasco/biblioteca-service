package com.example.usuarios.controllers;

import com.example.usuarios.entities.Usuario;
import com.example.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listar() { return repository.findAll(); }

    @PostMapping
    public Usuario crear(@RequestBody Usuario u) { return repository.save(u); }
}
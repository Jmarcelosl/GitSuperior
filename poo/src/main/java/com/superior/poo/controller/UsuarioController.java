package com.superior.poo.controller;

import com.superior.poo.dto.UsuarioDto;
import com.superior.poo.model.UsuarioModel;
import com.superior.poo.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/Usuario")

public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;
    @PostMapping
    public ResponseEntity<UsuarioModel> CriarUsuario(
            @Valid @RequestBody UsuarioDto usuarioDto) {
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuarioModel));
    }
    @GetMapping
    public ResponseEntity<List<UsuarioModel>> ListarUsuario() {
        return ResponseEntity.status(
                HttpStatus.OK).body(usuarioRepository.findAll());
    }
}
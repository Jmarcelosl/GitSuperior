package com.superior.poo.controller;

import com.superior.poo.dto.ClienteDto;
import com.superior.poo.model.ClienteModel;
import com.superior.poo.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/cliente")

public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;
    @PostMapping
    public ResponseEntity<ClienteModel> CriarCliente(
            @Valid @RequestBody ClienteDto clienteDto) {
        var clienteModel = new ClienteModel();
        BeanUtils.copyProperties(clienteDto, clienteModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteModel));
    }
    @GetMapping
    public ResponseEntity<List<ClienteModel>> ListarClientes() {
        return ResponseEntity.status(
                HttpStatus.OK).body(clienteRepository.findAll());
    }
}
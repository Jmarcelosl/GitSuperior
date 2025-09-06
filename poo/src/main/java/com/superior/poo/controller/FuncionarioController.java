package com.superior.poo.controller;

import com.superior.poo.dto.FuncionarioDto;
import com.superior.poo.model.FuncionarioModel;
import com.superior.poo.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioRepository funcionarioRepository;
    @PostMapping
    public ResponseEntity<FuncionarioModel> CriarFuncionario(
            @Valid @RequestBody FuncionarioDto funcionarioDto) {
        var funcionarioModel = new FuncionarioModel();
        BeanUtils.copyProperties(funcionarioDto, funcionarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioRepository.save(funcionarioModel));
    }
    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> ListarFuncionario() {
        return ResponseEntity.status(
                HttpStatus.OK).body(FuncionarioRepository.findAll());
    }
}
package com.superior.poo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBFUNCIONARIO")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDFUNCIONARIO")
    private int cdFuncionario;
    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionario;
    @Column(name = "NRTELEFONE")
    private String nrTelefone;
    @Column(name = "VLRSALARIO")
    private double vlrSalario;
    @Column(name = "FLATIVO")
    private String flAtivo;
}
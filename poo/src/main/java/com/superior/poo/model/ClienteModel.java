package com.superior.poo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBCLIENTE")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDCLIENTE")
    private int cdCliente;
    @Column(name = "NMCLIENTE")
    private String nmCliente;
    @Column(name = "NRTELEFONE")
    private String nrTelefone;
    @Column(name = "IDADECLIENTE")
    private int idadeCliente;
    @Column(name = "MTALTURA")
    private double mtAltura;
    @Column(name = "NMRUA")
    private String nmRua;
    @Column(name = "FLATIVO")
    private String flAtivo;
}

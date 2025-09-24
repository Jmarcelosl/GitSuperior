package com.gerenciamento.estoque.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBEMPRESA")
public class EmpresaModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDEMPRESA",  unique = true, nullable = false)
    private Integer cdEmpresa;
    private String nmRazo;
    private String nmFantasia;
    private String nuCnpj;
    private String nuTelefone;
    private String dsEndereco;
    private String nuEndereco;
    private String flAtivo;
}

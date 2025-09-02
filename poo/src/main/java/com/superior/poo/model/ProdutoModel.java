package com.superior.poo.model;

import jakarta.persistence.*;

@Entity
public class ProdutoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDPRODUTO")
    private int cdProduto;
}
package com.superior.poo.model;

import jakarta.persistence.*;

@Entity
public class ProdutoModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDPRODUTO")
    private int cdProduto;
    @Column(name = "NMPRODUTO")
    private String nmProduto;
    @Column(name = "DSPRODUTO")
    private String dsProduto;
    @Column(name = "VLPRODUTO")
    private double vlProduto;
    @Column(name = "FLATIVO")
    private String flativo;
}
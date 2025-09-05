package com.superior.poo.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

public record ProdutoDto(
    @NotBlank(message = "Não é possivel cadastrar o produto sem nome.") String nmProduto,
    String dsProduto,
    @NotNull(message = "Não é possível inserir o produto com o campo vazio.")
    @DecimalMin(value = "0.01",
            message = "Não é possivel cadastrar o produto com  valor abaixo de 0,01.")
    double vlProduto,
    @NotNull(message = "Não é possível inserir o produto com a flag vazia.")
    @NotBlank(message = "Não é possivel cadastrar o produto com a flag em branco.")
    String flAtivo
) {}
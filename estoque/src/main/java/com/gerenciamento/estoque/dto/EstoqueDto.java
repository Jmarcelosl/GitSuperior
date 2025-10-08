package com.gerenciamento.estoque.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EstoqueDto(
        Integer cdLocalEstoque,
        Integer qtEstoque,
        @NotBlank(message = "Não é possível salvar valor nulo")
        @Pattern(regexp = "^S|N$", message = "Só é possível inserir 'S' ou 'N' no status")
        String flAtivo
) {
}
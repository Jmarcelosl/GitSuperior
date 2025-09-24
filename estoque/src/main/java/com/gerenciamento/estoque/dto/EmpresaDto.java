package com.gerenciamento.estoque.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EmpresaDto(
        @NotBlank(message = "Não é possível salvar valor(Razão Social) em branco")
        String nmRazao,
        String nmFantasia,
        @NotBlank(message = "Não é possível salvar valor(CNPJ) em branco")
        String nuCnpj,
        String nuTelefone,
        @NotBlank(message = "Não é possível salvar valor(Endereço) em branco")
        String dsEndereco,
        String nuEndereco,
        @NotBlank(message = "Não é possível salvar valor nulo")
        @Pattern(regexp = "^S|N$", message = "Só é possível inserir 'S' ou 'N' no status")
        String flAtivo
) {
}

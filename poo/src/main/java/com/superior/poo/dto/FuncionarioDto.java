package com.superior.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto(
        @NotNull(message = "Não é possivel cadastrar o funcionario sem nome.")
        @NotBlank(message = "Não é possivel cadastrar o funcionario sem nome.")
        String nmFuncionario,
        @NotNull(message = "Não é possível inserir o funcionario com a flag vazia.")
        @NotBlank(message = "Não é possivel cadastrar o funcionario com a flag em branco.")
        String flAtivo
) {
}

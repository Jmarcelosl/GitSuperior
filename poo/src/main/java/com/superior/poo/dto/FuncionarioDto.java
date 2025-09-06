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
        String flAtivo,
        @NotNull(message = "Não é possível inserir o telefone com valor vazia.")
        @NotBlank(message = "Não é possivel cadastrar o telefone em branco.")
        String nrTelefone,
        @NotNull(message = "Não é possível inserir o salario com valor vazio.")
        @NotBlank(message = "Não é possivel cadastrar o salario em branco.")
        @DecimalMin(value = "0.01",
                message = "Não é possivel cadastrar o salario com valor abaixo de 0,01.")
        double vlrSalario
){}
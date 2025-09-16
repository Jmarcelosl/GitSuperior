package com.superior.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClienteDto(
        @NotNull(message = "Não é possivel cadastrar o cliente sem nome.")
        @NotBlank(message = "Não é possivel cadastrar o cliente sem nome.")
        String nmCliente,
        @DecimalMin(value = "0.01",
                message = "Não é possivel cadastrar o cliente com altura abaixo de 0,01.")
        double mtAltura,
        @NotNull(message = "Não é possível inserir o cliente com a flag vazia.")
        @NotBlank(message = "Não é possivel cadastrar o cliente com a flag em branco.")
        String flAtivo,
        @NotNull(message = "Não é possível inserir o telefone com valor vazio.")
        @NotBlank(message = "Não é possivel cadastrar o telefone em branco.")
        String nrTelefone,
        int idadeCliente,
        String nmRua
) { }
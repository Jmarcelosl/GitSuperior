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
        @NotNull(message = "Não é possível inserir o produto com a flag vazia.")
        @NotBlank(message = "Não é possivel cadastrar o produto com a flag em branco.")
        String flAtivo
) {
}
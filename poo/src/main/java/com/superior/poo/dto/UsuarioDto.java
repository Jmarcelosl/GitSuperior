package com.superior.poo.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UsuarioDto(
@NotNull(message = "Não é possivel cadastrar um usuario sem login.")
@NotBlank(message = "Não é possivel cadastrar um usuario sem login.")
String login,
@NotNull(message = "Senha não pode ser vazia.")
@NotBlank(message = "Senha não pode ser em branco.")
String senha,
@NotNull(message = "Não é possível inserir o cpf/cnpj sem valor.")
@NotBlank(message = "Não é possivel cadastrar o cpf/cnpj em branco.")
String nuCpfCnpj
){}
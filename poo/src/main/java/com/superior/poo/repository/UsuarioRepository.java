package com.superior.poo.repository;

import com.superior.poo.model.ProdutoModel;
import com.superior.poo.model.UsuarioModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository {
    Optional<ProdutoModel> findByIdUsuario(int idUsuario);
    Optional<ProdutoModel> findByLogin(String login);
    Optional<ProdutoModel> findAllByIdUsuario(int idUsuario);

    UsuarioModel save(UsuarioModel usuarioModel);

    List<UsuarioModel> findAll();
}
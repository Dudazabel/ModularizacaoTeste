package org.example.service;

import org.example.model.Usuario;
import org.example.repository.UsuarioDAO;

import java.sql.SQLException;

public class UsuarioService {

    public static void cadastrarUsuario(Usuario user) throws SQLException {
        var dao = new UsuarioDAO();

        if(dao.usuarioExiste(user.getNome())){
            throw new RuntimeException("Usuário já existe.");
        }

        dao.inserirUsuario(user);
    }
}

package org.example.repository;

import org.example.infraestrutura.dataBase.Conexao;
import org.example.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean usuarioExiste(String nome)throws SQLException{
        String query = "SELECT nome FROM usuario WHERE nome = ?";

        try(Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return true;
            }
        }

        return false;
    }

    public void inserirUsuario(Usuario user ) throws SQLException{
        String query = "INSERT INTO usuario(nome) VALUES (?)";

        try(Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, user.getNome());
            stmt.executeUpdate();
        }
    }
}

package org.example.infraestrutura.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ConcurrentModificationException;

public class Conexao {

    private static final String URL = "";
    private static final String USER = "";
    private static final String SENHA = "";

    public static Connection conectar()throws SQLException {
        return DriverManager.getConnection(URL, USER, SENHA);
    }
}

package org.example.view;

import org.example.model.Usuario;
import org.example.service.UsuarioService;

import java.util.Scanner;

public class View {
    static Scanner leia = new Scanner(System.in);

    public static void inicio(){
        System.out.println("1 - Cadastro de usuário");
        int opcao = leia.nextInt();
        leia.nextLine();

        switch (opcao){
            case 1 ->{
                cadastrarUsuario();
            }
        }
    }

    public static void cadastrarUsuario(){
        System.out.println("----CADASTRO DE USUÁRIO----");
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine();

        var usuario = new Usuario(nome);

        try{
            UsuarioService.cadastrarUsuario(usuario);
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
}

package com.joao.cursojava.aula17;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o usuário");
        String user = scan.next();
        System.out.println("Digite a senha: ");
        String senha = scan.next();

        for (; senha.equals(user);)
        {
            System.out.println("A senha não pode ser igual ao nome de usuário.");
            System.out.println("Digite o usuário");
            user = scan.next();
            System.out.println("Digite a senha: ");
            senha = scan.next();
        }
        System.out.println("Logado com sucesso!");
    }
}

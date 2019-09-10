package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o sexo (M ou F): ");
        String sexo = scan.next();

        switch(sexo)
        {
            case "M": System.out.println("Sexo Masculino"); break;
            case "F": System.out.println("Sexo Feminino"); break;
            default: System.out.println("Sexo Inválido"); break;
        }
    }
}

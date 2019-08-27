package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Período em que estuda(M- Matutino, V- Vespertino, N- Noturno) : ");
        String periodo = scan.next();

        switch(periodo)
        {
            case "M":
            case "m":
                System.out.println("Bom dia!"); break;
            case "V":
            case "v":
                System.out.println("Boa tarde!"); break;
            case "N":
            case "n":
                System.out.println("Boa noite!"); break;
            default: System.out.println("Valor inválido"); break;
        }
    }
}

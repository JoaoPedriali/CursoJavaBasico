package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a letra: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u"))
        {
            System.out.println("A letra é uma vogal");
        }
        else
        {
            System.out.println("A letra é uma consoante");
        }
    }
}

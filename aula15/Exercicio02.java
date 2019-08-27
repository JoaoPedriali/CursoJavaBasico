package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        double num = scan.nextDouble();

        if (num < 0)
        {
            System.out.println("O valor é negativo.");
        }
        else
        {
            System.out.println("O valor é positivo.");
        }

    }
}

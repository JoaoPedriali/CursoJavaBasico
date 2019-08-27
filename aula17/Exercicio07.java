package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scan.nextDouble();
        System.out.println("Digite o quarto número: ");
        double num4 = scan.nextDouble();
        System.out.println("Digite o quinto número: ");
        double num5 = scan.nextDouble();
        int i = 0;
        for (; i < num1 || i < num2 || i < num3 || i < num4 || i < num4 || i < num5; i++)
        {

        }
        System.out.println("O maior número é: " + i);
    }
}

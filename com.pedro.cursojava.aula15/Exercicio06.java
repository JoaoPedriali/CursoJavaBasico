package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scan.nextDouble();

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("O primeiro número é o maior.");
        }
        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("O segundo número é o maior.");
        }
        else if (num3 > num1 && num3 > num2)
        {
            System.out.println("O terceiro número é o maior. ");
        }
        else if (num1 == num2 && num1 == num3)
        {
            System.out.println("Os números são iguais.");
        }
        else
        {
            System.out.println("Dois dos três números são iguais.");
        }
    }
}

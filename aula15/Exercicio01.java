package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        if (num1 > num2)
        {
            System.out.println("O primeiro número é maior.");
        }
        else if (num2 > num1)
        {
            System.out.println("O segundo número é maior.");
        }
        else if (num1 == num2)
        {
            System.out.println("Os números são iguais.");
        }
    }
}

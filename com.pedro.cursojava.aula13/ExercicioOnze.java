package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um número real: ");
        double numReal = scan.nextDouble();

        System.out.println("A = "+ (num1 * 2) * (num2 / 2));
        System.out.println("B = " + ((num1 * 3) + numReal));
        System.out.println("C = " + (Math.pow(numReal, 3)));
    }
}

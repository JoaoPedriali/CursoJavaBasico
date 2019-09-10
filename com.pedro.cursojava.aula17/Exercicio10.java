package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scan.nextInt();
        while (num2 <= num1)
        {
            System.out.println("O segundo npumero deve ser maior que o primeiro.");
            System.out.println("Digite o segundo número");
            num2 = scan.nextInt();
        }
        for (;num1 <= num2; num1++)
        {
            System.out.println(num1);
        }
    }
}

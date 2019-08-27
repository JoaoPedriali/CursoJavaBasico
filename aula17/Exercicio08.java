package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int soma = 0;
        int media;
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Digite o número: ");
            num = scan.nextInt();

            soma += num;
        }

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A soma dos números é: " + soma /5);
    }
}

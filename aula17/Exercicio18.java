package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();
        int blockPrimo = 0;
        int m = num/2;
        for (int i = 2; i <= m;i++)
        {
            if (num%i == 0)
            {
                System.out.println("O número não é primo");
                blockPrimo = 1;
            }
        }
        if (blockPrimo == 0) {
            System.out.println("O número é primo");
        }
    }
}

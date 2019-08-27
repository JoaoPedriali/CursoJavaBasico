package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número:");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}

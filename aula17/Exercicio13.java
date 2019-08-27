package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scan.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = scan.nextInt();
        int resultado = 0;

        for (int i = 1; i < expoente; i++)
        {
            if (resultado == 0)
            {
                resultado = base * base;
            }else
            {
                resultado = resultado * base;
            }
        }
        System.out.println(resultado);
    }
}

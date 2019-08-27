package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        System.out.print("Preço do pão: ");
        double preco = scan.nextDouble();

        for (int i = 1; i <= 50; i++)
        {
            System.out.println(i + " - R$ " + (i*preco));
        }
    }
}

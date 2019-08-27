package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de CDs na sua coleção: ");
        int cds = scan.nextInt();
        double valor = 0;
        for (int i = 1; i <= cds; i++)
        {
            System.out.println("Qual o preço do CD número "+ i + "?");
            valor += scan.nextDouble();
        }
        System.out.println("O valor médio gasto em cada CD é de: " + (valor / cds));
    }
}

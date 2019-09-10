package com.joao.cursojava.aula20;

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int maior = 0;
        int linha = 0;
        int coluna = 0;

        Random numeroAleatorio = new Random();

        for (int i = 0; i<matriz.length;i++)
        {
            for (int j = 0; j<matriz[i].length; j++)
            {
                matriz[i][j] = numeroAleatorio.nextInt(100);
            }
        }

        for (int i = 0; i<matriz.length;i++)
        {
            for (int j = 0; j<matriz[i].length; j++)
            {
                if (maior < matriz[i][j])
                {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("Maior numero: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}

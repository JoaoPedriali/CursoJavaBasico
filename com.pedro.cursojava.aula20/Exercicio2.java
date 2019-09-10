package com.joao.cursojava.aula20;

import java.util.Arrays;
import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        Random gerador = new Random();
        int maiorLinha5 = 0;
        int maiorLinha7 = 0;
        int menorLinha5 = 0;
        int menorLinha7 = 0;
        for (int i = 0; i<matriz.length;i++)
        {
            for (int j = 0; j<matriz[i].length; j++)
            {
                matriz[i][j] = gerador.nextInt(100);
            }
        }

        for (int i = 0; i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (maiorLinha5 < matriz[4][j]) {
                    maiorLinha5 = matriz[4][j];
                }
                if (menorLinha5 > matriz[4][j]) {
                    menorLinha5 = matriz[4][j];
                }
                if (maiorLinha7 < matriz[6][j]) {
                    maiorLinha7 = matriz[6][j];
                }
                if (menorLinha7 > matriz[6][j]) {
                    menorLinha7 = matriz[6][j];
                }
            }
        }
        System.out.println("O maior valor da linha 5 é: " + maiorLinha5);
        System.out.println("O menor valor da linha 5 é: " + menorLinha5);
        System.out.println("O maior valor da linha 7 é: " + maiorLinha7);
        System.out.println("O menor valor da linha 7 é: " + menorLinha7);
        System.out.println(Arrays.deepToString(matriz));
    }
}

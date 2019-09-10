package com.joao.cursojava.aula20;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[][] tabuleiro = new String[3][3];
        boolean jogador1 = true;
        boolean vitoria = false;
        boolean jogaDeNovo = true;
        int linha = 0;
        int coluna = 0;
        while (vitoria==false)
        {
            while (jogaDeNovo == true)
            {
                for (int i = 0; i < tabuleiro.length; i++)
                {
                    for (int j = 0; j < tabuleiro[i].length; j++)
                    {
                        System.out.print(tabuleiro[i][j] + " ");
                    }
                    System.out.println();

                }
                if (jogador1==true)
                {
                    System.out.println("Jogador 1:");
                    System.out.println("Digite a linha: ");
                    linha = scan.nextInt();
                    System.out.println("Digite a coluna");
                    coluna = scan.nextInt();
                    if (tabuleiro[linha][coluna]==null)
                    {
                        tabuleiro[linha][coluna] = "X";
                        jogador1 = false;
                        jogaDeNovo = false;
                    } else
                    {
                        System.out.println("Jogada inválida");
                    }
                }
            }
            jogaDeNovo = true;
            while (jogaDeNovo==true)
            {
                for (int i = 0; i < tabuleiro.length; i++)
                {
                    for (int j = 0; j < tabuleiro[i].length; j++)
                    {
                        System.out.print(tabuleiro[i][j] + " ");
                    }
                    System.out.println();

                }
                if (jogador1==false)
                {
                    System.out.println("Jogador 2:");
                    System.out.println("Digite a linha: ");
                    linha = scan.nextInt();
                    System.out.println("Digite a coluna");
                    coluna = scan.nextInt();
                    if (tabuleiro[linha][coluna]==null)
                    {
                        tabuleiro[linha][coluna] = "O";
                        jogador1 = true;
                        jogaDeNovo = false;
                    } else
                    {
                        System.out.println("Jogada inválida");
                    }
                }
            }
        }
    }

}

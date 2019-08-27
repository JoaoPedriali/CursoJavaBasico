package com.joao.cursojava.aula17;

public class Exercicio04 {
    public static void main(String[] args) {
        int pais1 = 80000;
        int pais2 = 200000;
        int i = 0;
        for (; pais1 < pais2; i++)
        {
            pais1 += pais1 * 0.03;
            pais2 += pais2 * 0.015;
        }
        System.out.println("O tempo estimado para as populações serem iguais é de: " + i + " anos.");
        System.out.println("População do primeiro país: " + pais1);
        System.out.println("População do segundo país: " + pais2);
    }
}

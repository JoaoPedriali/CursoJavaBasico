package com.joao.cursojava.aula19;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        vetorA[0] = 10;
        vetorA[1] = 20;
        vetorA[2] = 30;
        vetorA[3] = 40;
        vetorA[4] = 50;

        for (int i = 0; i<vetorA.length; i++)
        {
            vetorB[i] = vetorA[i];
            System.out.println(vetorB[i]);
        }

    }
}

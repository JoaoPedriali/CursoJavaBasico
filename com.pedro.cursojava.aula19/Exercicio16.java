package com.joao.cursojava.aula19;

public class Exercicio16 {
    public static void main(String[] args) {
        int[] notas = new int[10];
        int soma = 0;
        int media = 0;
        int divisorMedia = 0;
        int totalIgual15 = 0;
        notas[0] = 6;
        notas[1] = 17;
        notas[2] = 10;
        notas[3] = 1;
        notas[4] = 20;
        notas[5] = 15;
        notas[6] = 4;
        notas[7] = 13;
        notas[8] = 15;
        notas[9] = 1;

        for (int i = 0; i<notas.length; i++)
        {
            if (notas[i] < 15)
            {
                soma += notas[i];
            }
            if (notas[i] == 15)
            {
                totalIgual15++;
            }
            if (notas[i] > 15)
            {
                media += notas[i];
                divisorMedia++;
            }
        }
        System.out.println("Soma das parcelas menores do que 15: " + soma);
        System.out.println("Total de notas igual a 15: " + totalIgual15);
        System.out.println("Media das notas maiores que 15: "+ media/divisorMedia);
    }
}

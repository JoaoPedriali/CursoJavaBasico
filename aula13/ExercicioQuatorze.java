package com.joao.cursojava.aula13;

import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo (em MB): ");
        double tamanho = scan.nextDouble();
        System.out.println("Digite a velocidade da conexão(em MBps):  ");
        double velocidade = scan.nextDouble();

        double tempo = ((tamanho / velocidade));
        if (tempo >= 60 && tempo <= 3600)
        {
            tempo = tempo / 60;
            System.out.println("O tempo de download, em minutos, será de: " + tempo + " minutos");
        }
        else if (tempo >= 3600){
            tempo = tempo / 3600;
            System.out.println("O tempo de download será de: " + tempo + " horas");
        }
        else {
            System.out.println("O tempo de download será de: " + tempo + " segundos");
        }

    }
}

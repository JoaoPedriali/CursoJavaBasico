package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menorTemp = Integer.MAX_VALUE;
        int maiorTemp = Integer.MIN_VALUE;
        double media = 0;
        int i = 0;
        boolean continua = true;
        for (;continua == true;i++)
        {
            System.out.println("Digite a temperatura (Caso deseje encerrar o programa digite 00.): ");
                int temperatura = scan.nextInt();
                media += temperatura;

                if (temperatura > maiorTemp) {
                    maiorTemp = temperatura;
                } else if (temperatura < menorTemp) {
                    menorTemp = temperatura;
                }
                if (temperatura == 00)
                {
                    continua = false;
                }
        }
        media = media / i;
        System.out.println("A menor temperatura registrada foi: " + menorTemp + "°");
        System.out.println("A maior temperatura registrada foi: " + maiorTemp + "°");
        System.out.println("A media das temperaturas registradas foi: " + media + "°");
    }
}

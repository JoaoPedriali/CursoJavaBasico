package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o fatorial");
        int fatorial = scan.nextInt();
        int resultado = 0;
        for (int i = fatorial; i > 0; i--)
        {
            if (resultado == 0)
            {
                resultado = i;
            }
            else
            {
                resultado = resultado * i;
            }
        }
        System.out.println(resultado);
    }
}

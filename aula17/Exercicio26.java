package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio26
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial de: ");
        int fator = scan.nextInt();
        int i = fator;
        System.out.print(i+"! = ");
        int resultado = 0;
        for (; i > 0; i--)
        {
            if (resultado == 0)
            {
                resultado = i;
            }
            else
            {
                resultado = resultado * i;

            }
            System.out.print(i + ".");
        }
        System.out.print(" = " + resultado);

    }
}

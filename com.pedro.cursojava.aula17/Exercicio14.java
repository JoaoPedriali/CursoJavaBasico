package com.joao.cursojava.aula17;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numerosPares = 0;
        int numerosImpares = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Digite o número: "+ "(" + i + ")");
            int num = scan.nextInt();
            int result = num % 2;
            if (result == 0)
            {
                numerosPares++;
            }else
            {
                numerosImpares++;
            }
        }
        System.out.println("A quantidade de numeros pares: " + numerosPares);
        System.out.println("A quantidade de numeros impares: " + numerosImpares);
    }



}

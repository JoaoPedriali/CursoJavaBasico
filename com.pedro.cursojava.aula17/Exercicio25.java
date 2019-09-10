package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while(1==1)
        {
            double total = 0;
            boolean fechaCaixa = false;

            System.out.println("Lojas Tabajara");
            for (int i = 1; fechaCaixa == false; i++)
            {

                System.out.print("Produto " + i + ": R$ ");
                double preco = scan.nextDouble();
                total += preco;

                if (preco == 0)
                {
                    fechaCaixa = true;
                    System.out.println("Total: R$ " + total);
                    System.out.print("Dinheiro: R$ ");
                    double dinheiro = scan.nextDouble();
                    System.out.println("Troco: R$ " + (dinheiro - total));
                }
            }
        }
    }
}

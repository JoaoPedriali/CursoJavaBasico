package com.joao.cursojava.aula15;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro preço: R$ ");
        double preco1 = scan.nextDouble();
        System.out.print("Digite o segundo preço: R$ ");
        double preco2 = scan.nextDouble();
        System.out.print("Digite o terceiro preço: R$ ");
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3)
        {
            System.out.println("Compre o primeiro produto.");
        }
        else if (preco2 < preco1 && preco2 < preco3)
        {
            System.out.println("Compre o segundo produto.");
        }
        else if (preco3 < preco1 && preco3 < preco2)
        {
            System.out.println("Compre o terceiro produto. ");
        }
        else if (preco1 == preco2 && preco1 == preco3)
        {
            System.out.println("Compre qualquer um dos produtos");
        }
        else
        {
            System.out.println("Dois produtos tem o mesmo valor, compre um destes dois.");
        }
    }
}

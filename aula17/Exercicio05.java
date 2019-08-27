package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a população do primeiro país");
        int pais1 = scan.nextInt();
        while (pais1 <= 0)
        {
            System.out.println("A população do país precisa ser maior que 0");
            System.out.println("Digite a população do primeiro país");
            pais1 = scan.nextInt();
        }

        System.out.println("Digite a taxa de crescimento do primeiro país: ");
        double crescimento1 = scan.nextDouble();
        while(crescimento1 <= 0)
        {
            System.out.println("Digite uma porcentagem maior que 0.");
            System.out.println("Digite a taxa de crescimento do primeiro país: ");
            crescimento1 = scan.nextDouble();
        }
        double crescimentoPorcentagem1 = crescimento1 / 100;

        System.out.println("Digite a população do segundo país: ");
        int pais2 = scan.nextInt();
        while (pais2 <= 0)
        {
            System.out.println("A população do país precisa ser maior que 0");
            System.out.println("Digite a população do primeiro país");
            pais2 = scan.nextInt();
        }

        System.out.println("Digite a taxa de crescimento do segundo país: ");
        double crescimento2 = scan.nextDouble();
        while(crescimento2 <= 0)
        {
            System.out.println("Digite uma porcentagem maior que 0.");
            System.out.println("Digite a taxa de crescimento do primeiro país: ");
            crescimento2 = scan.nextDouble();
        }
        double crescimentoPorcentagem2 = crescimento2 / 100;

        int i = 0;
        for (; pais1 < pais2; i++)
        {
            pais1 += pais1 * crescimentoPorcentagem1;
            pais2 += pais2 * crescimentoPorcentagem2;
        }
        System.out.println("O tempo estimado para as populações serem iguais é de: " + i + " anos.");
        System.out.println("População do primeiro país: " + pais1);
        System.out.println("População do segundo país: " + pais2);
    }
}

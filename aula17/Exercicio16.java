package com.joao.cursojava.aula17;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.println(n1);
        System.out.println(n2);
        for (; n3 <= 500 ;)
        {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

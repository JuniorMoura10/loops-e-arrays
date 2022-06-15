package com.santander.exercicios.loops;

/*
    Faça um programa que leia 5 números
    e informe o maior número entre eles
    e a média desses números
 */

import java.util.Scanner;

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        double media = 0;

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;
            soma = soma + numero;
            media = soma / 5;
            count++;
        } while (count < 5);

        System.out.println("Maior número é :" + maior);
        System.out.println("A média entre os números é :" + media);
    }
}

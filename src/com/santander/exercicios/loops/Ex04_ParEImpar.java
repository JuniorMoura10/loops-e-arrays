package com.santander.exercicios.loops;

/*
    Faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
 */

import java.util.Scanner;

public class Ex04_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdVezes;
        int numero;

        System.out.println("Quantas vezes você quer que eu conte?");
        qtdVezes = scan.nextInt();


        int par = 0;
        int impar = 0;




        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0){
                par++;
            }else{
                impar++;
            }
            count++;
        }while (count < qtdVezes);

        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}

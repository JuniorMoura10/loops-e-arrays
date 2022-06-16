package com.santander.exercicios.loops;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Qual tabuada você quer estudar? ");
        tabuada = scan.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}

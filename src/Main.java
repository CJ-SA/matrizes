package org.example;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int soma = 0;
        int[] valores = {5, 8, 10, 2, 5};
        for (int i = 0; i < 5; i++) {
            soma = soma + valores[i];


        }
        System.out.print(" soma dos valores ");
        for (int i = 0; i < valores.length - 1; i++){
            System.out.print(valores[i]);
            System.out.print(" + ");
            if (i == valores.length) break;
        }

        System.out.print(" é igual à " + soma);
    }
}

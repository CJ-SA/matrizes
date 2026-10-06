package org.example;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int soma = 0;
        int maior = 0;
        int[] valores = {20, 30, 140, 50, 90};
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
            if (valores[i] > maior)
            {
                maior = valores [i];
            } else {
                maior = maior + 0;
            }


        }


        System.out.println(maior);
    }
}

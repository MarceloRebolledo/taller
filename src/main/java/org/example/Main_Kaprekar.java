package org.example;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.Arrays;

public class Main_Kaprekar {

    public static void main(String[] args) {
        System.out.println("Clase Main");

    }
//aquí van sus funciones:
    public static int kaprekarOp(int num) {
        int n1 = num / 1000; //numero de miles
        int n2 = (num / 100) % 10; //numero de centena
        int n3 = (num / 10) % 10; //numero de decena
        int n4 = num % 10; //numero de unidad

        int[] numeros = {n1, n2, n3, n4};
        Arrays.sort(numeros);

        int asc = numeros[0] * 1000 + numeros[1] * 100 + numeros[2] * 10 + numeros[3];
        int desc = numeros[3] * 1000 + numeros[2] * 100 + numeros[1] * 10 + numeros[0];

        return desc - asc;
    }

}
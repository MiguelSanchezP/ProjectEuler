/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
package com.miguelsanchezp;

import java.util.ArrayList;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        long numeroInicial = 600851475143L;
        ArrayList<Integer> factores = new ArrayList<>();
        extraerFactores (numeroInicial, factores);
        int maximoValor = 0;
        for (Integer i : factores) {
            if (i>maximoValor) {
                maximoValor = i;
            }
        }
        System.out.println(maximoValor);
    }

    private static void extraerFactores (long numero, ArrayList<Integer> factores) {
        if (numero > 1L) {
            for (int i = 2; i <= numero; i++) {
                if (numero % i == 0) {
                    factores.add(i);
                    if (numero/i != 1) {
                        extraerFactores(numero / i, factores);
                    }
                    break;
                }
            }
        }
    }
}

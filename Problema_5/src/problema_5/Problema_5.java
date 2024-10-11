/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_5;

/**
 *
 * @author michael
 *
 *
 */

/*2520 es el número más pequeño que puede ser dividido por cada uno de los números del 1 al 10 sin ningún residuo.

¿Cuál es el número positivo más pequeño que es divisible uniformemente (divisible sin ningún residuo) por todos los números del 1 al 20?*/
public class Problema_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 1;
        int divisores = 20;
        System.out.println(divicion(number, divisores));
    }

    public static int divicion(int number, int divisores) {
        int numero = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= divisores; j++) {
                if (i % j != 0) {
                    break;
                } else if (i % j == 0 && j == divisores) {
                    numero = i;
                }
            }
            number++;
            if (numero != 0) {
                break;
            }
        }
        return numero;

    }
}

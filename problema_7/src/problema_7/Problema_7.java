/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_7;

/**
 *
 * @author michael
 */
public class Problema_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(primos(10001));
    }

    public static int primos(int nume) {
        int i = 2;
        int cont = 0;
        int can = 1;
        int numep = 0;
        do {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                //System.out.println("Numero primos: " + i);
                can++;
                numep = (can <= nume)? 0:i;
            }
            cont = 0;

            i++;
        } while (can <= nume);
        return numep;

    }
}

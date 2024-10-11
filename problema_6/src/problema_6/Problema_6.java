/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_6;

/**
 *
 * @author michael
 */
public class Problema_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(sumaCuadrado(100));
    }

    public static int sumaCuadrado(int nume) {
        int sumC = 0;
        int sum = 0;
        for (int i = 1; i <= nume; i++) {
            sumC += getSquare(i);
            sum += i;
        }
        return getSquare(sum) - sumC;
    }

    public static int getSquare(int number) {
        return number * number;
    }
}

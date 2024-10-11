/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author michael
 */

/*<p>A palindromic number reads the same both ways. The largest palindrome made from the product of two $2$-digit numbers is $9009 = 91 \times 99$.</p>
<p>Find the largest palindrome made from the product of two $3$-digit numbers.</p>*/
/*public class Problema_4 {

  
    public static void main(String[] args) {
        List<Integer> palindromosMayor = new ArrayList<>();
        int nume = 101;
        for (int i = 0; i <= 999; i++) {
            System.out.println(multiplicacion(nume + i));
            palindromosMayor.add(multiplicacion(nume + i));
        }

        Optional<Integer> maxNumero = palindromosMayor.stream()
                .reduce((a, b) -> a > b ? a : b);
        
        System.out.println( maxNumero.orElse(null));
    }

    public static int multiplicacion(int nume) {
        List<Integer> Palindromos = new ArrayList<>();
        for (int cont = nume; cont <= 999; cont++) {
            if (String.valueOf(nume * cont).equals(reverseInt(String.valueOf(nume * cont)))) {
                //System.out.println("Palindromo: " + nume * cont);
                Palindromos.add(nume * cont);
            }
        }
        Optional<Integer> maxNumero = Palindromos.stream()
                .reduce((a, b) -> a > b ? a : b);
        return maxNumero.orElse(null);
    }

    public static String reverseInt(String input) {
        StringBuilder sb = new StringBuilder();
        String[] numeInve = new String[input.length()];
        int ind = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            numeInve[ind] = String.valueOf(input.charAt(i));
            ind++;
        }

        for (String nombre : numeInve) {
            sb.append(nombre).append("");
        }
        return sb.toString();

    }
}*/
public class Problema_4 {
    public static void main(String[] args) {
        int mayorPalindromo = 0; // Inicializar el mayor palíndromo encontrado

        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) { // Comenzar desde 'i' para evitar duplicados
                int producto = i * j;
                if (esPalindromo(producto) && producto > mayorPalindromo) {
                    mayorPalindromo = producto; // Actualizar el mayor palíndromo
                }
            }
        }

        System.out.println("El mayor palíndromo es: " + mayorPalindromo);
    }

    // Método para verificar si un número es palíndromo
    public static boolean esPalindromo(int num) {
        String numStr = String.valueOf(num);
        return numStr.equals(reverseString(numStr));
    }

    // Método para revertir una cadena
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
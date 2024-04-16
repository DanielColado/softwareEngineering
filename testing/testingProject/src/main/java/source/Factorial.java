/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source;

/**
 *
 * @author malve
 */
public class Factorial {
    
    // Método para calcular el factorial de un número entero positivo
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


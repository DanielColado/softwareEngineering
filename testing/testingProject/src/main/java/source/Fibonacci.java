/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source;

/**
 *
 * @author Daniel
 */
public class Fibonacci {
    public String generateFibonacci(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        
        StringBuilder fibonacciSequence = new StringBuilder();
        int a = 0, b = 1;
        
        if (n >= 1) {
            fibonacciSequence.append(a).append(" ");
        }
        if (n >= 2) {
            fibonacciSequence.append(b).append(" ");
        }
        for (int i = 2; i < n; i++) {
            int next = a + b;
            fibonacciSequence.append(next).append(" ");
            a = b;
            b = next;
        }
        
        return fibonacciSequence.toString();
    }
}


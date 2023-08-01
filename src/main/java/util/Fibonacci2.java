package util;

/*
 Gestione numeri Fibonacci soluzione iterativa

 */


public class Fibonacci2 {

    public static void main(String[] args) {
        int n = 12; //
        fibonacciIterativa(n);
    }

    public static void fibonacciIterativa(int n) {
        int primoNumero = 1;
        int secondoNumero = 1;


        System.out.print("La serie di Fibonacci è: ");

        for (int i = 0; i <= n; i++) {

            System.out.print(primoNumero + " ");

            int proxNumero = primoNumero + secondoNumero;
            primoNumero = secondoNumero;
            secondoNumero = proxNumero;
        }
    }
}


package fibo;
import java.util.*;
public class fibo {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el número de términos: ");
    int n = sc.nextInt();

    System.out.println("Serie de Fibonacci hasta " + n + " términos:");

        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        
        sc.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }


}

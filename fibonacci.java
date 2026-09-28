package fibo;
import java.util.*;
public class fibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
        int a = 0, b = 1;

        System.out.println("Serie de Fibonacci hasta " + n + " términos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

	}

}

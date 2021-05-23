import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double r = 2.0;
		double raio;
		double area;
		
		raio = sc.nextDouble();
		raio = Math.pow(raio, r);
		
		area = pi * raio;
		
		System.out.printf("A = %.4f ", area);
		
		sc.close();

	}

}

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c, raio, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.141559;
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		raio = Math.pow(c, 2);
		
		triangulo = (c * a) / 2;
		circulo = (raio * pi);
		trapezio = (a + b) * c / 2;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado); 
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
		scanner.close();

	}

}

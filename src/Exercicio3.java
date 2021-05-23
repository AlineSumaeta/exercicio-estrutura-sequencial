
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, d, diferente;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferente = (a * b - c * d);
		
		System.out.println("Diferenca = " + diferente);
		
		sc.close();

	}

}

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int codPeca1, codPeca2;
		int nPeca1, nPeca2;
		double valorPeca1, valorPeca2, total1, total2, resultado;
		
		codPeca1 = scanner.nextInt();
		nPeca1 = scanner.nextInt();
		valorPeca1 = scanner.nextDouble();
		codPeca2 = scanner.nextInt();
		nPeca2 = scanner.nextInt();
		valorPeca2 = scanner.nextDouble();
		
		total1 = nPeca1 * valorPeca1;
		total2 = nPeca2 * valorPeca2;
		
		resultado = total1 + total2;
		
		System.out.printf("Valor a pagar: R$ %.2f",resultado);		
		
		scanner.close();
	
	}

}

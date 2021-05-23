import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		int n_funcionario;
		double horas_trabalhadas, salario, total;
		
		n_funcionario = scanner.nextInt();
		horas_trabalhadas = scanner.nextDouble();
		salario = scanner.nextDouble();
		
		total = horas_trabalhadas * salario;
		
		System.out.println("Number = " + n_funcionario);
		System.out.printf("Salary = U$ %.2f", total);
		
		scanner.close();
	}

}

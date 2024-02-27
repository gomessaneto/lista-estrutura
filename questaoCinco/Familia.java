package questaoCinco;
import java.util.Scanner;

public class Familia {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int numero = scanner.nextInt();
		
		Calculadora calculadora = new Calculadora(numero);
		calculadora.parOrImpar(numero);
		calculadora.ehPrimo(numero);
		
		
	scanner.close();
	
}
}
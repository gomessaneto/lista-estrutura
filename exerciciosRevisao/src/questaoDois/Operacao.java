package questaoDois;
import java.util.Scanner;

public class Operacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		double numeroUm = scanner.nextInt();
		
		System.out.println("\nDigite o operador: ");
		String operador = scanner.next();
		
		System.out.println("\nDigite o segundo numero: ");
		double numeroDois = scanner.nextInt();
		
		Bastidores operacao = new Bastidores(operador);
		operacao.realizarOperacao(numeroDois, numeroDois, operador);

	}

}

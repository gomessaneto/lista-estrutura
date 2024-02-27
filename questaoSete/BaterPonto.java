package questaoSete;
import java.util.Scanner;

public class BaterPonto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Quantas horas voce trabalhou?");
		Double horasReceber = scanner.nextDouble();
		
		Sistema sistema = new Sistema (horasReceber);
		sistema.pagarHoras(horasReceber);
	}

}

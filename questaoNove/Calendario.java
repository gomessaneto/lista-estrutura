package questaoNove;
import java.util.Scanner;

public class Calendario {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Insira o numero do mes(contando a partir do 0. exemplo: janeiro mes 0 - fevereiro mes 1): ");
		int mes = scanner.nextInt();
		
		Reuniao rM = new Reuniao (meses, mes);
		rM.requestMonth(meses);
	}
}

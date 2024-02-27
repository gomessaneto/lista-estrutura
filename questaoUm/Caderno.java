package questaoUm;
import java.util.Scanner;

public class Caderno {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Ponha um numero para descobrir sua tabuada: ");	
	int numeroTal = scanner.nextInt();
	
	Tabuada tabuada = new Tabuada(numeroTal);
	tabuada.tabuadaOriOb();
	
    scanner.close();
}//main
}//clas
package questaoOito;
import java.util.Scanner;

public class Feira {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Indique o preco de custo");	
	Double custoProduto = scanner.nextDouble();
			
	System.out.println("Indique o preco de venda");	
	Double vendaProduto = scanner.nextDouble();
	
	Fazenda feirinha = new Fazenda (custoProduto, vendaProduto);
	feirinha.venda();
	
	}

}

package questaoCinco;

public class Calculadora {

	public int num;
	
	public Calculadora(int num) {
		this.num = num;
	}
	
	public void parOrImpar(int num) {
		if(num%2==0) {
			System.out.println("O numero eh par");
		} else {
			System.out.println("O numero eh impar");
		}
	}
	
	public void ehPrimo(int num) {
		int cont=0;
		for(int i = 1; i <= num; i++) {
			if (num%i==0) {
				cont++;
			}
		}
		if (cont==2) {
			System.out.println("O numero '"+ num +"' eh primo");
			
		} else {
			System.out.println("O numero '"+ num +"' nao eh primo");	
		}
	}
	 
}

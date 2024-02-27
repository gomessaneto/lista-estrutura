package questaoUm;

public class Tabuada {
    private int numero;

	public Tabuada(int numero) {
		this.numero = numero;
	}

	public void tabuadaOriOb() {
		
		if (numero <=10) {
		System.out.println("Tabuada de " + numero + ":");
		int contador = 1 ;
		
		while (contador <= 10) {
			int resultado = numero * contador;
			System.out.println(numero + "x" + contador + "=" + resultado);
			contador++;
			
			}//if
			} else {
				System.out.println("Por favor, colocar numero que esteja entre 0 a 10.");
			
			 }//else
			 }//field
			 }//class-tabuada
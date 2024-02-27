package questaoDois;

public class Bastidores {

	public String operador;
	public Double numeroUm;
	public Double numeroDois;

	public Bastidores(String operador) {
		this.operador = operador;
	}
	
	public Bastidores(Double numeroUm, Double numeroDois) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
	}

	public void realizarOperacao (Double numeroUm, Double numeroDois, String operador) {
		
		switch (operador) {
        case "+":
            double soma = numeroUm + numeroDois;
            System.out.println("Resultado: " + soma);
            break;
            
        case "-":
            double sub = numeroUm - numeroDois;
            System.out.println("Resultado: " + sub);
            break;
            
        case "*":
           double multi = numeroUm * numeroDois;
           System.out.println("Resultado: " + multi);
           break;
            
        case "/":
            double div = numeroUm/ numeroDois;
            System.out.println("Resultado: " + div);
            break;
        	
        default:
            System.out.println("Opção inválida, coloque operadores iguais a: '+, -, * ou /''");
		}	
		}
		}
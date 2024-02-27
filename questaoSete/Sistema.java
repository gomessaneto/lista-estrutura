package questaoSete;

public class Sistema {

	public int horas;
	public Double valorFixo;
	
	public Sistema(int horas) {
		this.horas = horas;
	}
	
	public Sistema(Double valorFixo) {
		this.valorFixo = valorFixo;
	}

	public void pagarHoras(Double horas) {
		double valor =  12.25 * horas;
		System.out.println("O total que voce tem a receber eh: " + valor);
		
	}
	
}









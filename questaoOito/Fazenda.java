package questaoOito;

public class Fazenda {

	
	
	public Double custo;
	public Double venda;
	
	public Fazenda(Double custo, Double venda) {
		this.custo = custo;
		this.venda = venda;
	} 
	
	public void venda() {
		if(venda*2>custo) {
			System.out.println("Houve lucro!");
		} else {
			System.out.println("Houve prejuizo!");
		}
	}
}

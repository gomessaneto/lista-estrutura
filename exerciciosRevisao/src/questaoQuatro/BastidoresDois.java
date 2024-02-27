package questaoQuatro;

public class BastidoresDois {

	public int num;

	public BastidoresDois(int num) {
		this.num = num;
	}
	
	public void zeroTrinta () {
		for(int i=0; i<=30; i++) {
			if(num%2!=0){
				int somaImpar = num += i;
				System.out.println("resultado: " + somaImpar);
			} 
		}
	}
}
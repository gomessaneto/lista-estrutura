package questaoNove;

public class Reuniao {

	public String[] meses = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};	
	
	public int mes;
	
	public Reuniao(String[] meses, int mes) {
		this.meses = meses;
		this.mes = mes;
	}

	public void requestMonth(String [] meses) {
	for (int i=0; i<=11; i++) {
		if(mes==i) {
			System.out.println("O mês condizente com este numero eh: " + meses[i]);
		} else {
			System.out.println("Esse numero nao condiz com nenhum mes. Preste atencao na regre e tente novament.");
		}
	}
	}
	}
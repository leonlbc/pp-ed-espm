package exercicio2;

public class Main {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		// insercao dos dados na fila
		fila.enfileirar(new Motorista("Selmini", "ABC-4546"));
		fila.enfileirar(new Motorista("Flavio", "BYZ-7576"));
		fila.enfileirar(new Motorista("Surjan", "BBB-1234"));
		fila.enfileirar(new Motorista("Surian", "DDD-7777"));
		
		// remocao de alguns motoristas da fila
		fila.desenfileirar();
		fila.desenfileirar();
		
		// impressao dos dados dos motoristas que ainda estao na fila
		fila.mostrarDados();		

	}
}

package exercicio1;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// insercao de objetos na lista
		lista.inserir(10, "verde");
		lista.inserir(11, "verde");
		lista.inserir(5, "amarelo");
		lista.inserir(12, "verde");
		lista.inserir(6, "amarelo");
		
		// impressao dos objetos inseridos na lista
		lista.imprimir();

	}
}

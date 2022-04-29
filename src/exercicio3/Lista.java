package exercicio3;

public class Lista {

	No inicio, fim;
	
	// metodo para inserir um elemento na lista
	public void inserir(int dado) {
		No aux = new No(dado);
		if(inicio == null) {
			fim = aux;
		} else {
			aux.dir = inicio;
			inicio.esq = aux;
		}
		inicio = aux;		
	}
	
	// metodo para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}

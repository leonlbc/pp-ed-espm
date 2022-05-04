package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// insercao dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
		if (lista.inicio != null) {
			No aux = lista.inicio;
			No fim = lista.fim;
			while (aux != null){
				//Armazena o No
				No aux2 = aux;
				//Mover aux para o lado
				aux = aux.dir;
				//Troca esquerda e direita
				No esq = aux2.esq;
				aux2.esq = aux2.dir;
				aux2.dir = esq;

				if (aux == lista.inicio) {
					lista.fim = fim;
				} else if (aux == fim) {
					lista.inicio = aux;
				}
			}
		}
	}
}

package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// metodo para inserir um elemento na lista.
	// a insercao deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		if (inicio == null) {
			inicio = aux;
			fim = aux;
		}
		else {
			No aux2 = inicio;
			while (aux2 != null) {
				if (dado < aux2.dado) {
					if (aux2 == inicio) {
						inicio = aux;
					} else {
						aux2.esq.dir = aux;
					}
					No aux2_esq = aux2.esq;
					aux2.esq = aux;
					aux.dir = aux2;
					aux.esq = aux2_esq;
					break;
				} else {
					if (aux2 == fim) {
						aux2.dir = aux;
						aux.esq = aux2;
						fim = aux;
						break;
					} 
					aux2 = aux2.dir;
				}
			}
		}
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

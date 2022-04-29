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
			No aux_in = inicio;
			boolean inseriu = false;
			while (!inseriu) {
				if (dado < aux_in.dado) {
					if (aux_in == inicio) {
						inicio = aux;
						aux.dir = aux_in;
						aux_in.esq = aux;
					} else {
						aux_in.esq.dir = aux;
						aux_in.esq = aux;
						aux.dir = aux_in;
					}
					inseriu = true;
				} else {
					if (aux_in == fim) {
						aux_in.dir = aux;
						aux.esq = aux_in;
						fim = aux;
						inseriu = true;
					} else {
						aux_in = aux_in.dir;
					}
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

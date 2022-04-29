package exercicio1;

public class Lista {
	No inicio, fim;
	
	// insere um no no final da lista. Esse metodo sera chamado pelo metodo inserir
	private void inserirFim(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			fim.prox = aux;
		}
		fim = aux;
	}
	
	//esse metodo devera ser implementado de acordo com o enunciado do exercicio
	private void inserirPrioridade(No aux) {
		if(inicio == null) {
			inicio = aux;
		} else {
			if (inicio.cor != aux.cor){
				No x = inicio;
				inicio = aux;
				aux.prox = x;
			} else {
				No y = inicio;
				while(y.prox.cor == aux.cor){
					y = y.prox;
				}
				No z = y.prox;
				y.prox = aux;
				aux.prox = z;
			}
		}
	}
	
	// metodo inserir. Esse metodo sera chamado a partir da classe Main
	public void inserir(int numero, String cor) {
		No aux = new No(numero, cor);
		if(cor.equalsIgnoreCase("verde")) {
			inserirFim(aux);
		} else {
			inserirPrioridade(aux);
		}
	}
	
	// metodo utilizado para imprimir os dados da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.numero);
			aux = aux.prox;
		}
	}
}

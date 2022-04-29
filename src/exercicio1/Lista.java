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
			No ultimo_amarelo = inicio;
			while(ultimo_amarelo.prox.cor == aux.cor){
				ultimo_amarelo = ultimo_amarelo.prox;
			}
			if (ultimo_amarelo.cor != aux.cor) {
				inicio = aux;
				aux.prox = ultimo_amarelo;
			} else {
				No prox_ultimo = ultimo_amarelo.prox;
				ultimo_amarelo.prox = aux;
				aux.prox = prox_ultimo;
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

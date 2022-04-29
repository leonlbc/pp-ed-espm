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
		} else { // Se nao houver amarelos, inserir no inicio
			if (inicio.cor != aux.cor){
				No inicio_aux = inicio;
				inicio = aux;
				aux.prox = inicio_aux;
			} else { // Se houver amarelo(s), inserir depois do ultimo amarelo
				No fim_amarelo = inicio;
				while(fim_amarelo.prox.cor == aux.cor){
					fim_amarelo = fim_amarelo.prox;
				}
				No fim_aux = fim_amarelo.prox;
				fim_amarelo.prox = aux;
				aux.prox = fim_aux;
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

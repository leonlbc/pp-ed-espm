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
			fim = aux;
		} else {
			if (!inicio.cor.equalsIgnoreCase(aux.cor)){ // Se nao houver amarelos, inserir no inicio
				No inicio_aux = inicio;
				inicio = aux;
				aux.prox = inicio_aux;
			} else { // Se houver amarelo(s), inserir depois do ultimo amarelo
				if(fim.cor.equalsIgnoreCase(aux.cor)){ // Se o ultimo elemento da lista for amarelo, ele sera o fim
					fim.prox = aux;
					fim = aux;
				}
				else { // Colocar antes do primeiro verde
					No fim_amarelo = inicio;
					while(fim_amarelo.prox.cor.equalsIgnoreCase(aux.cor)){
						fim_amarelo = fim_amarelo.prox;
					}
					No verde = fim_amarelo.prox;
					fim_amarelo.prox = aux;
					aux.prox = verde;
				}
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

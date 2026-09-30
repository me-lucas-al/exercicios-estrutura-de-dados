public class No {
    private Integer valor;
    private No proximo;

    No() {
        this.valor= null;
        this.proximo = null;
    }

    No(int valor) {
        this.valor= valor;
        this.proximo = null;
    }

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

    public void imprimirLista(No inicio) {
        No atual = inicio;

        while (atual != null) {
            IO.println(atual.getValor());
            atual = atual.getProximo();
        }
    }

    public void inserirNoFinalDaLista(int valor, No inicio) {
        No novo = new No(valor);
        No atual = inicio;

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        atual.setProximo(novo);
    }

    public void inserirOrdenado(int valor, No inicio) {
        No novo = new No(valor);
        No atual = inicio;
        while (atual.getProximo() != null && atual.getProximo().getValor() < valor) {
            atual = atual.getProximo();
        }

        novo.setProximo(atual.getProximo());
        atual.setProximo(novo);
    }
    public void inserirNoInicioDaLista(int valor, No inicio) {
        No novo = new No(valor);

        novo.setProximo(inicio.getProximo());
        inicio.setProximo(novo);
    }
    

    
}

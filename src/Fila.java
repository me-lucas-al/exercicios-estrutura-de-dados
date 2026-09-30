public class Fila {
    private int inicioFila;
    private int fimFila;
    private int tamanho;
    private int[] itens;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
        this.itens = new int[tamanho];
        this.inicioFila = 0;
        this.fimFila = 0;
    }

	public int getInicioFila() {
		return inicioFila;
	}

	public void setInicioFila(int inicioFila) {
		this.inicioFila = inicioFila;
	}

	public int getFimFila() {
		return fimFila;
	}

	public void setFimFila(int fimFila) {
		this.fimFila = fimFila;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int[] getItens() {
		return itens;
	}

	public void setItens(int[] itens) {
		this.itens = itens;
	}
    public void enfileirar(int valor) {
        if (filaEstaCheia()) {
            IO.println("Não é possível enfileirar, a fila está cheia.");
            return;
        } else {
            itens[fimFila] = valor;
            fimFila++;
        }
    }

    public void desinfileirar() {
        if (filaEstaVazia()) {
            IO.println("Não é possível desinfileirar, a fila está vazia.");
        } else {
            inicioFila++;
        }
    }
    public boolean filaEstaVazia(){
        if (inicioFila == fimFila) {
            return true;
        } else {
            return false;
        }
    }
    public boolean filaEstaCheia(){
        if (fimFila == itens.length) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirFila() {
        for (int i = inicioFila; i < fimFila; i++) {
            IO.println(itens[i]);
        }
    }
}
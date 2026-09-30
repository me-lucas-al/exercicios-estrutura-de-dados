public class FilaCircular {
    private int tamanho;
    private int inicioFila;
    private int fimFila;
    private int totalElementos;
    private int[] itens;

	public FilaCircular(int tamanho) {
		this.tamanho = tamanho;
        this.itens = new int[tamanho];
		this.inicioFila = 0;
		this.fimFila = 0;
		this.totalElementos = 0;
	}
    
    public void enfileirar(int valor) {
        if(filaEstaCheia()) {
            IO.println("Fila cheia");
        } else {
            itens[fimFila] = valor;
            fimFila = (fimFila + 1) % itens.length;
            totalElementos++;
        }

    }

    public void desinfileirar() {
        if(filaEstaVazia()) {
            IO.println("Fila vazia");
        } else {
            itens[inicioFila] = 0;
            inicioFila = (inicioFila + 1) % itens.length;
            totalElementos--;
        }
    }

    public boolean filaEstaCheia() {
        if(totalElementos == itens.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean filaEstaVazia() {
        if(totalElementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirFila() {
        if(filaEstaVazia()) { IO.println("Fila vazia");}
        else {
            for(int i=0; i < totalElementos; i++) {
                int indice = (inicioFila + i) % itens.length;
                IO.println(itens[indice]);
            }
        }
    }
//--------------------------------------------------------------------------------------------------------------
	public int getTamanho() {
		return tamanho;
	}


	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
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


	public int getTotalElementos() {
		return totalElementos;
	}


	public void setTotalElementos(int totalElementos) {
		this.totalElementos = totalElementos;
	}

    
    
}

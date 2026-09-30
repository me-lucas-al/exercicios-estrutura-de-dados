void main() {
    // testarFila();
    IO.println();
    // testarFilaCircular();
    IO.println();
    // testarNo();
    IO.println();
    // testarInserirOrdenado();
}

void testarFila() {
    IO.println("=== Fila normal ===");
    Fila fila = new Fila(3);

    fila.enfileirar(10);
    fila.enfileirar(20);
    fila.enfileirar(30);
    IO.println("Elementos enfileirados:");
    fila.imprimirFila();

    fila.desinfileirar();
    IO.println("Após desenfileirar um elemento:");
    fila.imprimirFila();
}

void testarFilaCircular() {
    IO.println("=== Fila circular ===");
    FilaCircular fila = new FilaCircular(3);

    fila.enfileirar(10);
    fila.enfileirar(20);
    fila.enfileirar(30);
    IO.println("Elementos enfileirados:");
    fila.imprimirFila();

    fila.desinfileirar();
    IO.println("Após desenfileirar um elemento:");
    fila.imprimirFila();

    IO.println();
    
    fila.enfileirar(40);
    IO.println("Após enfileirar 40 novamente:");
    fila.imprimirFila();

    IO.println();
    IO.println("Fila circular está vazia? " + fila.filaEstaVazia());
    IO.println("Fila circular está cheia? " + fila.filaEstaCheia());
}

void testarNo() {
    IO.println("=== Nó e lista encadeada ===");
    No inicio = new No();
    No no1 = new No(10);
    No no2 = new No(20);
    No no3 = new No(30);

    inicio.setProximo(no1);
    no1.setProximo(no3);
    no3.setProximo(no2);

    inicio.imprimirLista(inicio.getProximo());
    inicio.inserirNoFinalDaLista(40, inicio);
    inicio.inserirNoFinalDaLista(80, inicio);
    inicio.inserirNoFinalDaLista(90, inicio);
    IO.println("Lista após inserção de novos nós no final:");
    inicio.imprimirLista(inicio.getProximo());
}

void testarInserirOrdenado() {
    IO.println("=== Inserção ordenada ===");
    No inicio = new No();
    int[] valores = {30, 10, 20, 25};

    for (int valor : valores) {
        inicio.inserirOrdenado(valor, inicio);
        IO.println("Após inserir " + valor + ":");
        inicio.imprimirLista(inicio.getProximo());
        IO.println();
    }
}
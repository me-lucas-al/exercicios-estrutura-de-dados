# 📚 Exercícios de Estrutura de Dados

Repositório dedicado ao estudo prático e resolução de exercícios da disciplina de **Estrutura de Dados** do curso do **Instituto Federal de São Paulo (IFSP) — Campus Bragança Paulista**, sob orientação do **Prof. Rafael Muniz**.

---

## 🎯 Objetivo

Praticar e consolidar os conceitos fundamentais de algoritmos e estruturas de dados clássicas em Java, compreendendo o funcionamento interno, gerenciamento de índices, alocação e manipulação de referências de memória através de nós.

---

## 📂 Estruturas Implementadas

### 1. Fila Sequencial (`Fila.java`)
- Implementação estática baseada em vetor (`array`).
- Controle de ponteiros de início (`inicioFila`) e fim (`fimFila`).
- Operações de `enfileirar` (enqueue) e `desenfileirar` (dequeue).
- Verificações de fila cheia e fila vazia.

### 2. Fila Circular (`FilaCircular.java`)
- Otimização do uso do buffer/vetor reaproveitando posições liberadas no início.
- Uso do operador de resto (`%`) para rotação dos índices.
- Controle dinâmico do número total de elementos presentes (`totalElementos`).

### 3. Lista Encadeada Simples (`No.java`)
- Estrutura dinâmica encadeada baseada em referências (`proximo`).
- Inserção de novos nós no final da lista (`inserirNoFinalDaLista`).
- Inserção de novos nós no início da lista (`inserirNoInicioDaLista`).
- **Inserção ordenada** (`inserirOrdenado`): posiciona novos elementos em ordem crescente diretamente durante a inserção.
- Percurso e impressão iterativa dos elementos da lista.

---

## 🛠️ Tecnologias

- **Linguagem:** Java (JDK 21+)
- **Ambiente de Desenvolvimento:** IntelliJ IDEA

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/me-lucas-al/exercicios-estrutura-de-dados.git
   ```

2. Abra o projeto na sua IDE Java preferida (IntelliJ IDEA, Eclipse ou VS Code).

3. Execute a classe de testes principal em [`src/Main.java`](src/Main.java) para visualizar as operações e demonstrações no console.

---

## 👨‍🏫 Informações Acadêmicas

- **Instituição:** Instituto Federal de Educação, Ciência e Tecnologia de São Paulo (IFSP)
- **Campus:** Bragança Paulista
- **Disciplina:** Estrutura de Dados
- **Docente:** Prof. Rafael Muniz

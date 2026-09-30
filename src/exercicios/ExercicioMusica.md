  🎧 Exercício: Gerenciador de Playlist de Músicas

  Imagine que você está criando o sistema de reprodução em fila de um aplicativo de músicas (estilo Spotify). Você
  deve implementar uma Lista Encadeada Simples do Zero sem usar nenhuma classe do Java Collections (ArrayList,
  LinkedList, etc.).
  ──────
  ### 1. Modelagem das Classes

  Você criará duas classes do zero:

  #### A. Classe Musica (O Nó da Lista)

  Deve conter os atributos:

  • String titulo (nome da música)
  • String artista (nome do artista/banda)
  • int duracaoSegundos (tempo de duração em segundos)
  • Musica proximo (referência para a próxima música)
  • Construtor(es), getters e setters.

  #### B. Classe Playlist (A Lista Encadeada)

  Deve conter:

  • Um atributo privado Musica inicio (apontando para a primeira música ou null se vazia).
  • Um atributo privado int totalMusicas (contador do tamanho da lista).
  ──────
  ### 2. Métodos que você deve implementar do zero na Playlist

  Implemente os seguintes métodos com sua própria lógica de ponteiros:

  1. adicionarAoFinal(String titulo, String artista, int duracao)
      • Cria o nó e insere a música no final da playlist.
  2. adicionarNoInicio(String titulo, String artista, int duracao)
      • Cria o nó e insere a música no topo da fila de reprodução (para tocar a seguir).
  3. tocarProxima()
      • Remove e retorna (ou imprime) a primeira música da lista (simula que a música tocou e saiu da fila).
      • Se a playlist estiver vazia, deve avisar que não há músicas.
  4. exibirPlaylist()
      • Percorre a lista e imprime todas as músicas no formato:
      1. Titulo - Artista (X seg)
      • Se estiver vazia, exibe mensagem informativa.
  5. buscarPorTitulo(String titulo)
      • Percorre a lista procurando pelo título.
      • Retorna a posição (índice 1, 2, 3...) onde a música está ou -1 se não for encontrada.
  6. calcularTempoTotal()
      • Percorre todos os nós somando a duração de cada música e exibe o tempo total da playlist formatado em minutos
      e segundos (ex: 12 minutos e 45 segundos).
  7. removerPorTitulo(String titulo)
      • Procura a música pelo título e a remove da playlist, ajustando os ponteiros do nó anterior com o próximo.
      • Tratar se for a primeira música, se for no meio, se for no fim ou se não existir.

  ──────
  ### 3. Cenário de Teste na Main

  Crie um método na Main para testar todo o fluxo:

  1. Criar uma playlist vazia e tentar chamar tocarProxima() (verificar se trata lista vazia sem estourar erro).
  2. Adicionar 3 músicas no final.
  3. Adicionar 1 música no início ("Tocar a seguir").
  4. Listar todas as músicas e ver o tempo total.
  5. Buscar uma música existente e uma inexistente.
  6. Remover uma música do meio.
  7. Chamar tocarProxima() e ver se a primeira música foi consumida e os ponteiros continuam íntegros.
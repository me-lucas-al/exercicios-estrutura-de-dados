package exercicios;

public class Playlist {
    private Musica inicio;
    private int totalMusicas;

	public Playlist(Musica inicio, int totalMusicas) {
		this.inicio = inicio;
		this.totalMusicas = totalMusicas;
	}

    public boolean playlistEstaVazia() {
        if(this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }


    public void adicionarAoFinal(String titulo, String artista, int duracao){
        if (playlistEstaVazia()) {
            IO.println("Playlist está vazia");
        }
        Musica musicaNova = new Musica(titulo, artista, duracao);

        Musica musicaAtual = this.inicio;

        while(musicaAtual.getProximo() != null) {
            musicaAtual = musicaAtual.getProximo(); 
        }

        musicaAtual.setProximo(musicaNova);
    }

    public void adicionarNoInicio(String titulo, String artista, int duracao){
        if (playlistEstaVazia()) {
            IO.println("Playlist está vazia");
        }

        Musica musicaNova = new Musica(titulo, artista, duracao);

        Musica musicaInicial = this.inicio;

        musicaNova.setProximo(musicaInicial.getProximo());
        musicaInicial.setProximo(musicaNova);
    }

    public void tocarProxima(){
        if (playlistEstaVazia()) {
            IO.println("Playlist está vazia");
        }
        Musica musicaAtual = this.inicio;

        IO.println("Pulando: " + musicaAtual.toString());
        this.inicio = musicaAtual.getProximo();

        exibirPlaylist();

    }

    public void exibirPlaylist(){
        if (playlistEstaVazia()) {
            IO.println("Playlist está vazia");
        }

        Musica musicaAtual = this.inicio;

        IO.println("Tocando agora: " + musicaAtual.toString());
        IO.println("Playlist após tocar a próxima: \n");

        while(musicaAtual.getProximo() != null) {
            musicaAtual = musicaAtual.getProximo(); 
            IO.println(musicaAtual.toString() + "\n");
        }
    }
    //Getters and Setters
	public Musica getInicio() {
		return inicio;
	}

	public void setInicio(Musica inicio) {
		this.inicio = inicio;
	}

	public Integer getTotalMusicas() {
		return totalMusicas;
	}

	public void setTotalMusicas(Integer totalMusicas) {
		this.totalMusicas = totalMusicas;
	}

    
    
}

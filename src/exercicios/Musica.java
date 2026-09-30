package exercicios;

public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private Musica proximo;

	public Musica() {
        this.titulo = "Musica inicial";
        this.artista = "Inicio";
        this.duracaoSegundos = 0;
        this.proximo = null;
	}

	public Musica(String titulo, String artista, int duracaoSegundos) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracaoSegundos = duracaoSegundos;
		this.proximo = null;
	}

    // Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public void setDuracaoSegundos(int duracaoSegundos) {
		this.duracaoSegundos = duracaoSegundos;
	}

	public Musica getProximo() {
		return proximo;
	}

	public void setProximo(Musica proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return titulo + " - " + artista + " - " + duracaoSegundos;
	}
}

package ecomerce.model;

public abstract class Produto {
	private String titulo;
	private int pagina;
	private float valor;
	private String genero;
	
	public Produto(String titulo, int pagina, float valor, String genero) {
		this.titulo = titulo;
		this.pagina = pagina;
		this.valor = valor;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}

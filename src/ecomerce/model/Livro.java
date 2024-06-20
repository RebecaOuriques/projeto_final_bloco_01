package ecomerce.model;

public class Livro extends Produto {

	private String genero;
	
	public Livro(int numero, int tipo, String titulo, int pagina, float valor, String genero) {
		super(numero, tipo, titulo, pagina, valor);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Gênero: " + this.genero);
	}

}

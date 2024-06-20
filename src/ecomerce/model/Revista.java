package ecomerce.model;

public class Revista extends Produto{

	private String tema;

	public Revista(int numero, int tipo, String titulo, int pagina, float valor, String tema) {
		super(numero, tipo, titulo, pagina, valor);
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tema: " + this.tema);
	}

}

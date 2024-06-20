package ecomerce.model;

public abstract class Produto {
	private int numero;
	private String titulo;
	private int pagina;
	private float valor;
	private int tipo;
	
	
	public Produto(int numero, int tipo,String titulo, int pagina, float valor) {
		this.numero = numero;
		this.tipo = tipo;
		this.titulo = titulo;
		this.pagina = pagina;
		this.valor = valor;
	}
	
	

	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	
	public void visualizar()
	{
		String tipo = "";
		
		switch(this.tipo) {
		case 1: 
			tipo = "Livro";
			break;
		case 2: 
			tipo = "Revista";
			break;
		}
		
		System.out.println("\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Número do produto: " + this.numero);
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Tipo do produto: " + tipo);
		System.out.println("Quantidade de páginas: " + this.pagina);
		System.out.println("Valor: " + this.valor);
	}
	
	
	
	
}

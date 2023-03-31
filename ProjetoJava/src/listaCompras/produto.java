package listaCompras;

import java.text.NumberFormat;

public class produto {

	String categoria;
	int quantidade;
	String marca;
	String nome;
	String tipo;
	double preco;
	String codigo;
	
	
	public produto(String categoria, int quantidade, String marca, String nome, double preco, String codigo) {
		super();
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.marca = marca;
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCodBarras() {
		return codigo;
	}

	public void setCodBarras(String codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		return "\n- Nome:  " + nome + "\n- Categoria: " + categoria + "\n- Quantidade: " + quantidade + "\n- Marca: "
				+ marca +  "\n- Preço: " + formatarMoeda() + "\n- Código:  " + codigo;
	}

	//----------------------------------
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}

	
	
}

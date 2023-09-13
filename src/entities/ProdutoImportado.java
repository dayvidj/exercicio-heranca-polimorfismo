package entities;

public class ProdutoImportado extends Produto {
	private Double taxa;

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double precoTotal() {
		return this.getPreco() + taxa;
	}
	
	@Override
	public String tagPreco() {
		return this.getNome()+" $"+precoTotal()+" || Taxa: $"+taxa;
	}
	
	
}

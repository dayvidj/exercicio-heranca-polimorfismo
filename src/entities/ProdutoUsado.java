package entities;

import java.time.LocalDate;

public class ProdutoUsado extends Produto {
	private LocalDate dataFabricacao;

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String tagPreco() {
		return this.getNome()+"(usado) $"+this.getPreco()+" || Data de fabricação: "+dataFabricacao;
	}
	
	
}

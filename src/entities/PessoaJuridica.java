package entities;

public class PessoaJuridica extends Contribuinte{
	private int numeroF;
		
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, Double rendaAnual, int numeroF) {
		super(nome, rendaAnual);
		this.numeroF = numeroF;
	}

	public int getNumeroF() {
		return numeroF;
	}
	public void setNumeroF(int numeroF) {
		this.numeroF = numeroF;
	}

	@Override
	public Double imposto() {
		Double calculo = 0.0;
		if(numeroF > 10) {
			calculo = (this.getRendaAnual()*14) / 100;
		}
		else {
			calculo = (this.getRendaAnual()*16) / 100;
		}
		return calculo;
	}
}

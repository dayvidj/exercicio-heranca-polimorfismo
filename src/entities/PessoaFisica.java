package entities;

public class PessoaFisica extends Contribuinte{
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		Double calculo = 0.0;
		if(this.getRendaAnual() < 20000) {
			calculo = (15 * this.getRendaAnual()) / 100;
		}
		else {
			calculo = (25 * this.getRendaAnual()) / 100;
		}
		return calculo - (gastosSaude/2);
	}	
}

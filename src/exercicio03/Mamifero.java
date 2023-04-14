package exercicio03;

public class Mamifero extends Animal {
	
	protected String alimento;

	public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
		super(nome,  cor, "Terra", comprimento, velocidade, patas);
		this.alimento = alimento;
	}
	
	public Mamifero() {}
	
	public void alterarAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String alimento() {
		return this.alimento;
	}
	
	@Override
	public void dados() {
		super.dados();
		String dados = "Alimento: " + this.alimento;
		System.out.println(dados);
	}
	
}

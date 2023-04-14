package exercicio03;

public class Peixe extends Animal {
	
	protected String caracteristica;

	public Peixe(String nome, String caracteristica, int comprimento, float velocidade) {
		super(nome,  "Cinzenta", "Mar", comprimento, velocidade, 0);
		this.caracteristica = caracteristica;
	}
	
	public Peixe() {}
	
	public void alterarCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public String caracterisctica() {
		return this.caracteristica;
	}
	
	@Override
	public void dados() {
		super.dados();
		String dados = "Caracteristica: " + this.caracteristica;
		System.out.println(dados);
	}
	
}

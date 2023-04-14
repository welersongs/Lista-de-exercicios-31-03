package exercicio03;

public class Animal {

	protected String nome;
	protected String cor;
	protected String ambiente;
	protected int comprimento;
	protected float velocidade;
	protected int patas;
	
	
	public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
	}
	
	public Animal() {}
	
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
	public void alterarComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public void alterarPatas(int patas) {
		this.patas = patas;
	}
	
	public void alterarCor(String cor) {
		this.cor = cor;
	}
	
	public void alterarAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public void alterarVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public String nome() {
		return this.nome;
	}
	
	public int comprimento() {
		return this.comprimento;
	}
	
	public int patas() {
		return this.patas;
	}
	
	public String cor() {
		return this.cor;
	}
	
	public String ambiente() {
		return this.ambiente;
	}
	
	public float velocidade() {
		return this.velocidade;
	}
	
	public void dados() {
		String dados = "Animal: " + this.nome + "\n" 
						+ "Comprimento: " + this.comprimento + " cm\n"
						+ "Patas: " + this.patas + "\n"
						+ "Cor: " + this.cor + "\n"
						+ "Ambiente: " + this.ambiente + "\n"
						+ "Velocidade: " + this.velocidade + " m/s";
		System.out.println(dados);
	}
	
}

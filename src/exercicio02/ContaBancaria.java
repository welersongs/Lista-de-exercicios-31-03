package exercicio02;

public class ContaBancaria {
	
	String nomeCliente;
	int numConta;
	float saldo;
	
	public void sacar(float valor) {
		if(valor > this.saldo) {
			System.out.println("Erro");
		}
		else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void depositar(float valor) {
		this.saldo = valor + this.saldo;
	}
}

package exercicio02;

public class ContaBancaria {
	
	String nomeCliente;
	int numConta;
	float saldo;
	
	public void sacar(float valor) throws Exception {
		if(valor > this.saldo) {
			throw new Exception("Valor é maior que o saldo");
		}
		else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void depositar(float valor) {
		this.saldo = valor + this.saldo;
	}
}

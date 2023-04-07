package exercicio02;

public class ContaEspecial extends ContaBancaria {
	float limite;
	
	@Override
	public void sacar(float valor) {
		if(valor > super.saldo) {
			if( (valor - super.saldo) > limite) {
				System.out.println("Erro");
			}
		}
		else {
			super.saldo = super.saldo - valor;
		}
	}
}

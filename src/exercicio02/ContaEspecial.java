package exercicio02;

public class ContaEspecial extends ContaBancaria {
	float limite;
	
	@Override
	public void sacar(float valor) throws Exception {
		if(valor > super.saldo) {
			if( (valor - super.saldo) > limite) {
				throw new Exception("Valor é maior que o limite");
			}
		}
		else {
			super.saldo = super.saldo - valor;
		}
	}
}

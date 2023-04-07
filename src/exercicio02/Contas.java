package exercicio02;

public class Contas {

	public static void main(String[] args) {
		ContaBancaria cb = new ContaBancaria();
		
		cb.nomeCliente = "Pedro Felipe";
		cb.numConta = 123456789;
		cb.saldo = 1500f;
		
		//cb.sacar(100f);
			
		cb.depositar(2000f);
		//System.out.println(cb.saldo);
		/*-------------------------------------------*/
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cp.nomeCliente = "José";
		cp.numConta = 12345699;
		cp.saldo = 100f;
		
		
		cp.saldo = cp.calcularNovoSaldo(50);
		System.out.println(cp.saldo);
		
		System.out.println("Nome: "+ cp.nomeCliente+" / Conta:"+ cp.numConta);
	}

}

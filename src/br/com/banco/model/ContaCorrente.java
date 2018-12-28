package br.com.banco.model;



//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//reescrever e redefinir o metodo 
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		System.out.println("Chamando o método de sacar CC");
		//chamando metodo da classe mae
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}
	
}

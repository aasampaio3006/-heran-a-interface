package br.com.funcionario.model;

//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Designer R$200,00");
		return 200;
	}	

}

package br.com.funcionario.model;

//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de video R$150,00");
		return 150;
	}	

}

package br.com.funcionario.model;

//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel, eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;

//	public boolean autentica(int senha) {
//        if(this.senha == senha) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    //reescrista de metodo 
    public double getBonificacao() {
        //return super.salario;
    	//return (super.salario * 0.1) + super.salario;
    	//double soma = super.getBonificacao() + super.getSalario();
    	double soma = super.getSalario();
    	System.out.println("Chamando o método de bonificacao do Gerente R$" +soma);
    	return soma;
    	
    }

	

}

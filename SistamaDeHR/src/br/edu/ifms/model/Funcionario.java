package br.edu.ifms.model;

public class Funcionario extends Empregado{

	public Funcionario(String nome, String matricula, double salariobase) {
		super(nome, matricula, salariobase);
		// TODO Auto-generated constructor stub
		
	}

	//private double Salariobase;
	
	public double Calculaferias() {
		return this.getSalariobase() / 3;
		}
	
	public double Calculapagamento(double extras, double descontos) {
		return this.getSalariobase() + extras - descontos;
	}
	
	/*public String getNome() {
		return super.getNome();
	}*/


	
}

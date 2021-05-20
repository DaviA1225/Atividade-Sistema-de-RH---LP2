package br.edu.ifms.model;

public class Gerente extends Empregado{

	public Gerente(String nome, String matricula, double salariobase) {
		super(nome, matricula, salariobase);
		// TODO Auto-generated constructor stub
	}

	
	public double Calculaferias() {
		return (super.getSalariobase()*2)/3;
		}
	
	public double Calculapagamento(double extras, double descontos) {
		return (super.getSalariobase()*2) + extras - descontos;
	}
	
	/*public String getNome() {
		return super.getNome();
	}*/
}

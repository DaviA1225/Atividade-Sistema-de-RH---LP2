package br.edu.ifms.model;

import br.edu.ifms.control.Pagavel;

public class Funcionario extends Empregado implements Pagavel{

	public Funcionario(String nome, String matricula, double salariobase) {
		super(nome, matricula, salariobase);
		// TODO Auto-generated constructor stub
		
	}

	private double Salariobase;
	
	public double Calculaferias() {
		return super.getSalariobase() / 3;
		}
	
	public double calculapagamento(double extras, double descontos) {
		return this.Salariobase + extras - descontos;
	}
	
	public String GetNome() {
		return super.getNome();
	}

	@Override
	public double Calculapagamento(double extras, double descontos) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

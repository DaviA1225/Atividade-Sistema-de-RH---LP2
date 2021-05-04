package br.edu.ifms.model;

import br.edu.ifms.control.Pagavel;

public class Gerente extends Funcionario implements Pagavel{

	public Gerente(String nome, String matricula, double salariobase) {
		super(nome, matricula, salariobase);
		// TODO Auto-generated constructor stub
	}

	
	public double calculaferias() {
		return (super.getSalariobase()*2)/3;
		}
	
	public double calculapagamento(double extras, double descontos) {
		return (super.getSalariobase()*2) + extras - descontos;
	}
	
	public String getNome() {
		return super.getNome();
	}
}

package br.edu.ifms.model;

import br.edu.ifms.control.Pagavel;

public abstract class Empregado implements Pagavel{
	
	private String nome;
	private String matricula;
	private double salariobase;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}
	
	
	public Empregado(String nome, String matricula, double salariobase) {
		this.nome = nome; 
		this.matricula = matricula; 
		this.salariobase = salariobase;
	}
	
	public abstract double Calculaferias();
	
	

}

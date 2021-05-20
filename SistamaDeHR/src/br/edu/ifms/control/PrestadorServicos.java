package br.edu.ifms.control;

public class PrestadorServicos implements Pagavel {

	private String nome;
	private double Numerocontrato; 
	private double Customensal;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNumerocontrato() {
		return Numerocontrato;
	}
	public void setNumerocontrato(int numerocontrato) {
		Numerocontrato = numerocontrato;
	}
	public double getCustomensal() {
		return Customensal;
	}
	public void setCustomensal(double customensal) {
		Customensal = customensal;
	}
	
	
	public PrestadorServicos(String nome, double custoMensal, double numeroContrato) {
		this.nome = nome; this.Customensal = custoMensal; this.Numerocontrato = numeroContrato;
	}
	
	
	@Override
	public double Calculapagamento(double extras, double descontos) {
		
		return this.getCustomensal() + extras - descontos;
	}
	
	
	
}

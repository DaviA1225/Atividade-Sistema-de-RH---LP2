package br.edu.ifms.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifms.control.Pagavel;
import br.edu.ifms.control.PrestadorServicos;
import br.edu.ifms.model.Funcionario;
import br.edu.ifms.model.Gerente;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pagavel prestadorDeServico = new PrestadorServicos("ABC Limpeza", 5000, 143);
		Pagavel gerente = new Gerente("Pedro Ferreira da Silva", "34212", 2300);
		Pagavel funcionario1 = new Funcionario("Paulo José Pereira", "34156", 1900);
		Pagavel funcionario2 = new Funcionario("Aline Gonçalves Souza", "34254", 2300);
		
		List<Pagavel> folhaPagamento = new ArrayList<Pagavel>();
		folhaPagamento.add(prestadorDeServico);
		folhaPagamento.add(gerente);
		folhaPagamento.add(funcionario1);
		folhaPagamento.add(funcionario2);
		
		folhaPagamento.forEach(
				pagavel-> System.out.println(String.format("R$ %.2f - %s", pagavel.Calculapagamento(0,0),pagavel.getNome()))
						);

				

	}

}

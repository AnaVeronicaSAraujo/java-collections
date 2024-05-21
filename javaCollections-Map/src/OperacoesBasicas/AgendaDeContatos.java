package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
	private Map<String, Integer> agendaDeContatosMap;

	public AgendaDeContatos() {
		this.agendaDeContatosMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaDeContatosMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaDeContatosMap.isEmpty()) {
			agendaDeContatosMap.remove(nome);
		}
	}

	public void exibirContato() {
		System.out.println(agendaDeContatosMap);
	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaDeContatosMap.isEmpty()) {
			numeroPorNome = agendaDeContatosMap.get(nome);
			if (numeroPorNome == null) {
				System.out.println("Contato não encontrado na agenda.");
			}
		} else {
			System.out.println("A agenda de contatos está vazia.");
		}
		return numeroPorNome;
	}
}
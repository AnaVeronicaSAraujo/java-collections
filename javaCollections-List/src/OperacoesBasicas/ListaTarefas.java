package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefa> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String desricao) {
		tarefaList.add(new Tarefa(desricao));
	}

	public void removerTarefa(String desricao) {

		List<Tarefa> tarefasParaRemover = new ArrayList<>();

		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(desricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);	
	}

	public int obterNumeroTotalDeTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesDeTarefas() {
		System.out.println(tarefaList);
	}

}

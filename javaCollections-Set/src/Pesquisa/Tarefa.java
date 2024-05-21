package Pesquisa;

public class Tarefa {

	private String descricao;
	private boolean isConcluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.isConcluida = isConcluida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isConcluida() {
		return isConcluida;
	}

	public void setConcluida(boolean isConcluida) {
		this.isConcluida = isConcluida;
	}
	
	
	
	
}

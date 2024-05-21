package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoDeConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoDoConvite) {
		convidadoSet.add(new Convidado(nome, codigoDoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoDoConvite) {
		Convidado convidadoParaRemover = null;
		if (!convidadoSet.isEmpty()) {
			for(Convidado c : convidadoSet) {
				if (c.getCodigoDoConvite() == codigoDoConvite) {
					convidadoParaRemover = c;
					break;
				}
				convidadoSet.remove(convidadoParaRemover);
			}
		}
		else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	public int contarConvidados() {
		return convidadoSet.size();
	}
	public void exibirConvidados() {
		if (!convidadoSet.isEmpty()) {
			System.out.println(convidadoSet);
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}

}

package Fluxo;

import java.io.Serializable;

public class Cliente implements Serializable {
	
private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String proficao;
	
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getProficao() {
		return this.proficao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setProficao(String proficao) {
		this.proficao = proficao;
	}
}

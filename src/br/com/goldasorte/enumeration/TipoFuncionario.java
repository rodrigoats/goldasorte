package br.com.goldasorte.enumeration;

public enum TipoFuncionario {
	EFETIVO("Efetivo"),
	PRESTADORE("Prestador de servi�o"),
	COMISSIONADO("Comissionado"),
	PENCIONISTA("Pensionista");
	
	private String descricao;
	
	TipoFuncionario(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}

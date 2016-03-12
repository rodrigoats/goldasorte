package br.com.goldasorte.enumeration;


public enum PerfilAcesso {
	SECRETARIO("Secret�rio"),
	CHEFE("Chefe"),
	FUNCIONARIO("Funcion�rio");
	
	private String descricao;
	
	PerfilAcesso(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}

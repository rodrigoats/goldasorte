package br.com.goldasorte.enumeration;

public enum TipoPonto {

	ENTRADA("ENTRADA"),
	SAIDA("SA�DA"),
	ENTRADA_TURNO_DOIS("ENTRADA SEGUNDO TURNO"),
	SAIDA_TURNO_DOIS("SA�DA SEGUNDO TURNO");
	
	
	private String descricao;
	
	TipoPonto(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}

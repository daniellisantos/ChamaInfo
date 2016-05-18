package br.edu.ifba.mobile.wmobile.chamainfo.cadeia;

public abstract  class Atendimento {
	
	
	protected Atendimento proximo=null;

	public void setProximoAtendimento(Atendimento proximo){
		if(this.proximo!=null){
			this.proximo.setProximoAtendimento(proximo);
		}
		else{
			this.proximo=proximo;
		}
	}
	
	public abstract String agendar (TipoAtendimento atendimento);

}

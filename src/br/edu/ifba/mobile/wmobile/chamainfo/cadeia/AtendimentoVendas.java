package br.edu.ifba.mobile.wmobile.chamainfo.cadeia;

public class AtendimentoVendas extends Atendimento {
	
	@Override
	public String agendar(TipoAtendimento atendimento) {
		if (atendimento == TipoAtendimento.vendas)
		{
			return " Com o vendendor: marcosviana01@gmail.com ";
		}
		return proximo.agendar(atendimento);
	}

	

}

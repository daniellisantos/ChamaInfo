package br.edu.ifba.mobile.wmobile.chamainfo.cadeia;


public class AtendimentoManutencao extends Atendimento{
	
	
	@Override
	
	public String agendar(TipoAtendimento atendimento) {
		if (atendimento == TipoAtendimento.manutencao)
		{
			return " Com o t�cnico de manuten��o:joaosousalima@gmail.com ";
		}
		return proximo.agendar(atendimento);
	}


}

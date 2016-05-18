package br.edu.ifba.mobile.wmobile.chamainfo.cadeia;


public class AtendimentoManutencao extends Atendimento{
	
	
	@Override
	
	public String agendar(TipoAtendimento atendimento) {
		if (atendimento == TipoAtendimento.manutencao)
		{
			return " Com o técnico de manutenção:joaosousalima@gmail.com ";
		}
		return proximo.agendar(atendimento);
	}


}

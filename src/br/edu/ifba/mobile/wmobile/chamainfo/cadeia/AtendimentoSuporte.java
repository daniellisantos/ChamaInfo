package br.edu.ifba.mobile.wmobile.chamainfo.cadeia;

public class AtendimentoSuporte extends Atendimento {
	
@Override
	
	public String agendar(TipoAtendimento atendimento) {
		if (atendimento == TipoAtendimento.suporte)
		{
			return " Com o técnico em suporte: viniciuspadro@gmail.com ";
		}
		return " Não fazemos este tipo de serviço";
	}

}

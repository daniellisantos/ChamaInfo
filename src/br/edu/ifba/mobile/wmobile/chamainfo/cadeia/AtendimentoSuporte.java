package br.edu.ifba.mobile.wmobile.chamainfo.cadeia;

public class AtendimentoSuporte extends Atendimento {
	
@Override
	
	public String agendar(TipoAtendimento atendimento) {
		if (atendimento == TipoAtendimento.suporte)
		{
			return " Com o t�cnico em suporte: viniciuspadro@gmail.com ";
		}
		return " N�o fazemos este tipo de servi�o";
	}

}

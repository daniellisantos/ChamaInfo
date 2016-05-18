package br.edu.ifba.mobile.wmobile.chamainfo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.chamainfo.cadeia.Atendimento;
import br.edu.ifba.mobile.wmobile.chamainfo.cadeia.AtendimentoManutencao;
import br.edu.ifba.mobile.wmobile.chamainfo.cadeia.AtendimentoSuporte;
import br.edu.ifba.mobile.wmobile.chamainfo.cadeia.AtendimentoVendas;
import br.edu.ifba.mobile.wmobile.chamainfo.cadeia.TipoAtendimento;

@ManagedBean(name="aten")
@SessionScoped //não criar uma nova instancia da classe menu  quando mudar de página
public class Menu {
	private String emailAtendente="";
	private String emailCliente= "";
	private String atendido = "";
	private String telCliente = "";
	private String senhaAtendente= "";
	
	public String getEmailAtendente(){
		return emailAtendente;
	}
	public String getEmailCliente(){
		return emailCliente;
	}
	public String getTelCliente()
	{
		return telCliente;
	}
	
	public String getSenhaAtendente()
	{
		return senhaAtendente;
	}
	
	public void setEmailAtendente(String emailAtendente){
		this.emailAtendente=emailAtendente;
	}
	
	public void setEmailCliente(String emailCliente){
		this.emailCliente=emailCliente;
	}
	public void setTelCliente(String telCliente)
	{
		this.telCliente=telCliente;
	}
	public void setSenhaAtendente(String senhaAtendente)
	{
		this.senhaAtendente=senhaAtendente;
	}
	
	public List<String> getTiposAtendimento(){
		List<String> tipos = new ArrayList<String>();
		tipos.add("Vendas");
		tipos.add("Manutenção");
		tipos.add("Suporte");
		return tipos;
	}
	
	public void setAtendimentoEscolhido(String tipoAtendimento){
		TipoAtendimento tipo = TipoAtendimento.sem_servico;
		if (tipoAtendimento.equals("Vendas")){
			tipo = TipoAtendimento.vendas;
		} else if (tipoAtendimento.equals("Manutenção")){
			tipo = TipoAtendimento.manutencao;
		} else if (tipoAtendimento.equals("Suporte")){
			tipo = TipoAtendimento.suporte;
		}
		
		Atendimento at = new AtendimentoVendas();
		at.setProximoAtendimento(new AtendimentoManutencao());
		at.setProximoAtendimento(new AtendimentoSuporte());
		
		//System.out.println("Agendado atendimento para o cliente: " + emailCliente +"\n Telefone: "+telCliente);
		
		atendido = at.agendar(tipo);
	}
	
	public String getAtendido(){
		return atendido;
	}
	
	
	
}

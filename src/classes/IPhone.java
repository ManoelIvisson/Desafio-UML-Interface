package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
	public int ano;
	public String cor;
	public String modelo;
	
	@Override
	public void tocar() {
		System.out.println("Tocando");
		
	}
	
	@Override
	public void pausar() {
		System.out.println("Pausado");
		
	}
	
	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
		
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");	
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizarndo página");
		
	}
	
	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}
	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}
	
	public void ligandoDispositivo() {
		System.out.println("Ligando o dispositivo");
	}
	
	public void desligandoDispositivo() {
		System.out.println("Desligando o dispositivo");
	}
}

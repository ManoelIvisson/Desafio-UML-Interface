package classes;

public class Main {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		iphone.ligandoDispositivo();
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		
		iphone.ligar();
		
		iphone.exibirPagina();
		iphone.desligandoDispositivo();
	}
}

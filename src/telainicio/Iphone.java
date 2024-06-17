package telainicio;

import telainicio.Internet.NavegadorInternet;
import telainicio.Ipod.ReprodutorMusical;
import telainicio.Phone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) {
      ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
      AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
      NavegadorInternet navegadorInternet = new NavegadorInternet();
      
        System.out.println("Reprodutor Musical");
        System.out.println("");
        reprodutorMusical.tocar();
	    reprodutorMusical.pausar();
	    reprodutorMusical.selecionarMusica();
        System.out.println("________________");
        System.out.println("");

        System.out.println("Telefone");
        System.out.println("");
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        System.out.println("_________________");
        System.out.println("");

        System.out.println("Google Chrome");
        System.out.println("");
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        System.out.println("_________________");

    }
}
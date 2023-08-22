import internet.Navegador;
import reproduzir_musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) throws Exception {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        Navegador navegador = new Navegador();

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorrerioVoz();
        System.out.println("----------------------");

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();
        System.out.println("----------------------");

        navegador.atualizarPagina();
        navegador.atualizarPagina();
        navegador.exibirPagina();
        System.out.println("----------------------");
    }
}

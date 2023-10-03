import Navegador.Navegador;
import Navegador.Browser;
import Telefone.Telefone;
import Telefone.Phone;
import reprodutorMusical.ReprodutorMusical;
import reprodutorMusical.Player;

public class Iphone {
  public static void main(String[] args) {
    Navegador browser = new Browser();
    ReprodutorMusical player = new Player();
    Telefone phone = new Phone();

    System.out.println("--> Testes navegador");
    browser.novaAba();
    browser.exibirPagina("www.google.com.br");
    browser.atualizarPagina();

    System.out.println("");
    System.out.println("--> Testes Reprodutor de musica");
    player.selecionarMusica("Musica 1");
    player.tocar();
    player.pausar();

    System.out.println("");
    System.out.println("--> Testes telefone");
    phone.ligar(5555555555L);
    phone.atender(444444444);
    phone.iniciarCorreioVoz();
  }
}
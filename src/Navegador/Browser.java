package Navegador;

import java.util.ArrayList;
import java.util.List;

public class Browser implements Navegador{
  private List<Aba> abasAbertas;
  private Aba abaAtual;

  public Browser() {
    abaAtual = null;
    abasAbertas = new ArrayList<>();
  }

  @Override
  public void exibirPagina(String url) {
    if(abaAtual != null) {
      abaAtual.setUrlAtual(url);
    }

    System.out.println("Exibindo o site " + url);
  }

  @Override
  public void novaAba() {
    Aba novaAba = new Aba();
    abasAbertas.add(novaAba);
    abaAtual = novaAba;

    System.out.println("Nova aba criada");
  }

  @Override
  public void atualizarPagina() {
    abaAtual.setUrlAtual(abaAtual.getUrlAtual());

    System.out.println("Página atualizada. Exibindo o site " + abaAtual.getUrlAtual());
  }
}

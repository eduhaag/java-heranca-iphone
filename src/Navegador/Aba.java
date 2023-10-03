package Navegador;

import java.util.ArrayList;
import java.util.List;

public class Aba {
  private List<String> historico;
  private String urlAtual;

  public Aba(){
    historico = new ArrayList<>();
  }

  public String getUrlAtual() {
    return urlAtual;
  }

  public void setUrlAtual(String urlAtual) {
    historico.add(urlAtual);
    this.urlAtual = urlAtual;
  }
}

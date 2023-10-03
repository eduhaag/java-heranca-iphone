package Telefone;

import java.util.ArrayList;
import java.util.List;

public class Phone implements Telefone {
  private List<Chamada> chamadasRealizadas;
  private List<Chamada> chamadasRecebidas;

  public Phone () {
    chamadasRealizadas = new ArrayList<>();
    chamadasRecebidas = new ArrayList<>();
  }

  @Override
  public void ligar(long numero) {
    chamadasRealizadas.add(new Chamada((numero)));

    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender(long numero) {
    chamadasRecebidas.add(new Chamada(numero));

    System.out.println("Atendendo chamda de " + numero);
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }
}

package Telefone;

public class Chamada {
  private long contato;

  public Chamada(long numero) {
    this.contato = numero;
  }

  public long getContato() {
    return contato;
  }

  @Override
  public String toString() {
    return "Contato da chamda " + contato;
  }
}

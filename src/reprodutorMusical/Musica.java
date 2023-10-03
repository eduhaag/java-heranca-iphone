package reprodutorMusical;

public class Musica {
  private String name;

  public Musica(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Musica "+ name;
  }
}

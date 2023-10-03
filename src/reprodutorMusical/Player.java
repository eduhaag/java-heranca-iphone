package reprodutorMusical;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Player implements ReprodutorMusical {
  private List<Musica> musicas;
  private Optional<Musica> musicaSelecionada;

  public Player() {
    this.musicas = new ArrayList<>();

    for(int i = 1; i <= 5; i++){
      musicas.add(new Musica("Musica " + i));
    }
  }

  @Override
  public void tocar() {
    if(musicaSelecionada.isPresent()) {
      System.out.println("Tocando a musica " + musicaSelecionada.get().getName());
    } else {
      System.out.println("Não há nenhuma musica selecionada");
    }
  }

  @Override
  public void pausar() {
    musicaSelecionada.ifPresent(musica -> System.out.println("Musica " + musica.getName() + " pausada."));
  }

  @Override
  public void selecionarMusica(String nome) {
    musicaSelecionada = musicas.stream()
        .filter(musica -> musica.getName().equalsIgnoreCase(nome))
        .findFirst();

    System.out.println("Selecionada a musica " + musicaSelecionada.get().getName() );
  }
}

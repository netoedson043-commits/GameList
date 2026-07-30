package Jogo.Gamilist20.Principal;

import Jogo.Gamilist20.Modelo.JogosFavoritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogosFavoritosRepository  extends JpaRepository<JogosFavoritos, Long> {
}

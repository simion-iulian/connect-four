import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameShould {

  @Test
  void return_player_two_has_a_turn_after_player_one_has_played() {
    Game game = new Game();
    assertThat(game.play(), is("Player 2 has a turn"));
  }

  @Test
  void return_player_one_has_a_turn_after_player_two_has_played() {
    Game game = new Game();
    game.play();
    assertThat(game.play(), is("Player 1 has a turn"));
  }
}

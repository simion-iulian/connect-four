import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GameShould {

  @Test
  void return_player_two_has_a_turn_after_player_one_has_played() {
    Game game = new Game();
    assertThat(game.play(1), is("Player 2 has a turn"));
  }

  @Test
  void return_player_one_has_a_turn_after_player_two_has_played() {
    Game game = new Game();
    game.play(1);
    assertThat(game.play(1), is("Player 1 has a turn"));
  }

  @Test
  void not_allow_play_in_a_full_column() {
    Game game = new Game();
    for (int i = 0; i < 6; i++) {
      game.play(1);
    }
    assertThat(game.play(1), is("Column full!"));
  }

  @Test
  void not_alternate_players_when_player_puts_disc_in_full_column() {
    Game game = new Game();
    for (int i = 0; i < 9; i++) {
      game.play(1);
    }
    assertThat(game.play(0), is("Player 1 has a turn"));
  }
}

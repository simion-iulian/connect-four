import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Connect4Should {
  @Test
  void return_player_two_has_a_turn_after_player_one_has_played(){
    Connect4 game = new Connect4();
    assertThat(game.play(1), is("Player 2 has a turn"));
  }

  @Test
  void return_player_one_has_a_turn_after_player_two_has_played(){
    Connect4 game = new Connect4();
    game.play(1);
    assertThat(game.play(1), is("Player 1 has a turn"));
  }

  @Test
  void not_allow_play_in_a_full_column(){
    Connect4 game = new Connect4();
    for (int i = 0; i < 6; i++) {
      game.play(1);
    }
    assertThat(game.play(1), is("Column full!"));
  }

  @Test
  void not_alternate_player_one_when_player_puts_disc_in_full_column(){
    Connect4 game = new Connect4();
    for (int i = 0; i < 6; i++) {
      game.play(1);
    }
    assertThat(game.currentPlayer(), is(Player.ONE));
    assertThat(game.play(0), is("Player 2 has a turn"));
  }

  @Test
  void not_alternate_player_two_when_player_puts_disc_in_full_column(){
    Connect4 game = new Connect4();

    game.play(0);
    for (int i = 0; i < 6; i++) {
      game.play(1);
    }

    assertThat(game.currentPlayer(), is(Player.TWO));
    assertThat(game.play(0), is("Player 1 has a turn"));
  }

  @Disabled
  @Test
  void give_win_to_player_one_with_4_moves_in_first_column(){
    Connect4 game = new Connect4();

    game.play(0);
    game.play(1);
    game.play(0);
    game.play(1);
    game.play(0);
    game.play(1);
    game.play(0);

    assertThat(game.play(0), is("Player 1 wins!"));
  }
}

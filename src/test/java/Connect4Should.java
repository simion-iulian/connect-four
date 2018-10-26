import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class Connect4Should {
  @Test
  void return_player_two_has_a_turn_after_player_one_has_played(){
    Connect4 game = new Connect4();
    GameStatus currentStatus = game.play(1);

    assertThat(currentStatus, is(GameStatus.PLAYER_HAS_A_TURN));
    assertThat(game.currentPlayer(), is(Player.TWO));
  }

  @Test
  void return_player_one_has_a_turn_after_player_two_has_played(){
    Connect4 game = new Connect4();
    game.play(1);

    GameStatus gameStatus = game.play(1);

    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_A_TURN));
    assertThat(game.currentPlayer(), is(Player.ONE));
  }

  @Test
  void not_alternate_player_one_when_player_puts_disc_in_full_column(){
    Connect4 game = new Connect4();

    for (int i = 0; i < 6; i++) {
      game.play(1);
    }
    GameStatus gameStatus = game.play(1);

    assertThat(gameStatus, is(GameStatus.COLUMN_FULL));
    assertThat(game.currentPlayer(), is(Player.ONE));
  }

  @Test
  void not_alternate_player_two_when_player_puts_disc_in_full_column(){
    Connect4 game = new Connect4();

    game.play(0);
    for (int i = 0; i < 6; i++) {
      game.play(1);
    }

    GameStatus gameStatus = game.play(0);
    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_A_TURN));
    assertThat(game.currentPlayer(), is(Player.ONE));
  }

  @Test
  void give_vertical_win_to_player_one_with_4_moves_in_first_column(){
    Connect4 game = new Connect4();

    game.play(0); //1
    game.play(1); //2
    game.play(0); //1
    game.play(1); //2
    game.play(0); //1
    game.play(1); //2
    GameStatus gameStatus = game.play(0);

    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_WON));
    assertThat(game.currentPlayer(), is(Player.ONE));
  }

  @Test
  void not_give_vertical_win_to_player_one_with_4_moves_in_first_column(){
    Connect4 game = new Connect4();

    game.play(0); //1
    game.play(0); //2
    game.play(0); //1
    game.play(1); //2
    game.play(0); //1
    game.play(1); //2
    GameStatus gameStatus = game.play(0); //1

    assertThat(gameStatus, is(not(GameStatus.PLAYER_HAS_WON)));
    assertThat(game.currentPlayer(), is(Player.TWO));
  }

  @Test
  void give_vertical_win_to_player_one_in_first_column_with_one_player_two_disc_in_it(){
    Connect4 game = new Connect4();

    game.play(1); //1

    game.play(0); //2

    game.play(0); //1
    game.play(1); //2
    game.play(0); //1
    game.play(1); //2
    game.play(0); //1
    game.play(1); //2
    GameStatus gameStatus = game.play(0);

    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_WON));
    assertThat(game.currentPlayer(), is(Player.ONE));
  }

  @Test
  void give_vertical_win_to_player_one_with_4_moves_in_third_column(){
    Connect4 game = new Connect4();

    game.play(2); //1
    game.play(1); //2
    game.play(2); //1
    game.play(1); //2
    game.play(2); //1
    game.play(1); //2
    GameStatus gameStatus = game.play(2); // 1

    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_WON));
    assertThat(game.currentPlayer(), is(Player.ONE));
  }
  @Test
  void give_vertical_win_to_player_two_with_win_in_any_column(){
    Connect4 game = new Connect4();

    game.play(0); //1
    game.play(2); //2
    game.play(1); //1
    game.play(2); //2
    game.play(1); //1
    game.play(2); //2
    game.play(1); //1
    GameStatus gameStatus = game.play(2); // 2

    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_WON));
    assertThat(game.currentPlayer(), is(Player.TWO));
  }
  @Test
  void give_vertical_win_to_player_two_with_win_in_any_column_with_player_one_disc_in_it(){
    Connect4 game = new Connect4();

    game.play(2); //1
    game.play(2); //2
    game.play(1); //1
    game.play(2); //2
    game.play(1); //1
    game.play(2); //2
    game.play(1); //1
    GameStatus gameStatus = game.play(2); // 2

    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_WON));
    assertThat(game.currentPlayer(), is(Player.TWO));
  }

  @Test
  public void
  give_horizontal_win_to_player_one() {
    Connect4 game = new Connect4();

    game.play(0);
    game.play(0);
    game.play(1);
    game.play(1);
    game.play(2);
    game.play(2);
    game.play(3);
    game.play(3);
    GameStatus gameStatus = game.play(4);

    assertThat(gameStatus, is(GameStatus.PLAYER_HAS_WON));
    assertThat(game.currentPlayer(), is(Player.ONE));
  }
}

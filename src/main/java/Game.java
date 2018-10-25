public class Game {
  private Player player = Player.ONE;
  int columnFill = 0;


  public String play(int column) {
    columnFill++;
    if (columnFill > 6){
      return GameStatus.COLUMN_FULL.toString();
    }
    player = player.nextPlayer();
    return String.format(GameStatus.PLAYER_HAS_A_TURN.toString(), player.toString());
  }

}


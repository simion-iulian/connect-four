public class Game {
  private Player player = Player.ONE;
  int columnFill = 0;


  private String currentStatus() {
    return String.format(GameStatus.PLAYER_HAS_A_TURN.toString(), player.toString());
  }

  public String play() {
    columnFill++;
    if (columnFill > 6){
      return "Column full!";
    }
    player = player.nextPlayer();
    return currentStatus();
  }

}


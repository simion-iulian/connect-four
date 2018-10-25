public class Game {
  private Player player = Player.ONE;

  private String currentStatus() {
    return String.format(GameStatus.PLAYER_HAS_A_TURN.toString(), player.toString());
  }

  public String play() {
    player = player.nextPlayer();
    return currentStatus();
  }

}


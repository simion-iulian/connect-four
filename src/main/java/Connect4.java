import java.util.Arrays;
import java.util.List;

public class Connect4 {

  public Player currentPlayer() {
    return player;
  }

  private Player player = Player.ONE;
  List<Column> columns;
  Grid grid = new Grid();

  public Connect4() {
    columns = Arrays.asList(
      new Column(), new Column(), new Column(),
      new Column(), new Column(), new Column());
  }

  public GameStatus play(int column){
    if(grid.isColumnFull(column)){
      return GameStatus.COLUMN_FULL;
    }

    grid.putDiscInColumn(player,column);

    if(grid.hasPlayerWon(player)){
      return GameStatus.PLAYER_HAS_WON;
    }

    player = player.nextPlayer();

    return GameStatus.PLAYER_HAS_A_TURN;
  }
}


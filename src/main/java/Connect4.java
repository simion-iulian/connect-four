import java.util.Arrays;
import java.util.List;

public class Connect4 {
  private Player player = Player.ONE;
  List<Column> columns;
  Grid grid = new Grid();

  public Connect4() {
    columns = Arrays.asList(
      new Column(), new Column(), new Column(),
      new Column(), new Column(), new Column());
  }

  public String play(int column){
    if(grid.isColumnFull(column)){
      return GameStatus.COLUMN_FULL.toString();
    }

    grid.putDiscInColumn(player,column);

    if(grid.hasPlayerWon(player)){
      return String.format(GameStatus.PLAYER_HAS_WON.toString(), player.toString());
    }

    player = player.nextPlayer();

    return String.format(GameStatus.PLAYER_HAS_A_TURN.toString(), player.toString());
  }
}


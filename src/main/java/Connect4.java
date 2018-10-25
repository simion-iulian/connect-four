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

  public Player currentPlayer(){
    return player;
  }

  public String play(int column){
    grid.putDiscInColumn(player,column);

    if(grid.columnSizeFor(column) > 6){
      return GameStatus.COLUMN_FULL.toString();
    }

    player = player.nextPlayer();

    if(grid.columnSizeFor(column) >= 4){
      return String.format(GameStatus.PLAYER_HAS_WON.toString(), player.toString());
    }

    return String.format(GameStatus.PLAYER_HAS_A_TURN.toString(), player.toString());
  }
}


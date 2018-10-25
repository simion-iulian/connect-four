import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Connect4 {
  private Player player = Player.ONE;
  List<Column> columns;

  public Connect4() {
    columns = Arrays.asList(
      new Column(), new Column(), new Column(),
      new Column(), new Column(), new Column());
  }

  public Player currentPlayer(){
    return player;
  }

  public String play(int column){
    columns.get(column).putDisc(player);

    if(columns.get(column).size() > 6 && column == 1){
      return GameStatus.COLUMN_FULL.toString();
    }

    player = player.nextPlayer();

    if(columns.get(0).size() >= 4){
      return String.format(GameStatus.PLAYER_HAS_WON.toString(), player.toString());
    }

    return String.format(GameStatus.PLAYER_HAS_A_TURN.toString(), player.toString());
  }
}


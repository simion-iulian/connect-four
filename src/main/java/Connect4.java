public class Connect4 {
  private Player player = Player.ONE;
  int columnFill = 0;
  Column columnOne = new Column();

  public Player currentPlayer(){
    return player;
  }

  public String play(int column){
    if(column == 1)
      columnOne.putDisc(player);

    if (columnOne.size() > 6 && column == 1){
      return GameStatus.COLUMN_FULL.toString();
    }

    player = player.nextPlayer();
    return String.format(GameStatus.PLAYER_HAS_A_TURN.toString(), player.toString());
  }
}


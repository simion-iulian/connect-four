public class Connect4 {

  public Player currentPlayer() {
    return player;
  }

  private Player player = Player.ONE;
  private Grid grid = new Grid();

  public Connect4() { }

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


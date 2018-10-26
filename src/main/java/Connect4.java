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

    if(hasPlayerWon()){
      return GameStatus.PLAYER_HAS_WON;
    }

    player = player.nextPlayer();
    return GameStatus.PLAYER_HAS_A_TURN;
  }

  private boolean hasPlayerWon() {
    return isPlayerWinningVertically();
  }

  private boolean isPlayerWinningVertically(){
    int discs = 0;
    int resetCounter = -1;

    for (Player move : grid.getColumns().get(grid.getLastInsertColumn()).getPlayerMoves()) {
      if(!move.equals(player)) {
        discs = resetCounter;
      }
      discs++;
    }
    return discs == 4;
  }
}


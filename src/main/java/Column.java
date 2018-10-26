import java.util.ArrayList;

public class Column {
  public ArrayList<Player> getPlayerMoves() {
    return playerMoves;
  }

  private ArrayList<Player> playerMoves;

  Column(){
    playerMoves = new ArrayList<>();
  }

  void putDisc(Player player){
    playerMoves.add(player);
  }

  int size(){
    return playerMoves.size();
  }



  boolean isPlayerWinningVertically(Player player){
    int discs = 0;
    int resetCounter = -1;
    for (Player move : playerMoves) {
      if(!move.equals(player)) {
        discs = resetCounter;
      }
      discs++;
    }
    return discs == 4;
  }
}

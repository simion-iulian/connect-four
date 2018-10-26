import java.util.ArrayList;

public class Column {
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
    if(playerMoves.size() < 4)
      return false;
    int lastDisc = playerMoves.size() - 1;
    return
      playerMoves.get(lastDisc) == playerMoves.get(lastDisc - 1) &&
      playerMoves.get(lastDisc - 2) == playerMoves.get(lastDisc - 3);
  }
}

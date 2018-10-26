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
    int discs = 0;
    for (Player move : playerMoves) {
      if(move.equals(player)){
        discs++;
      } else {
        discs = 0;
      }
    }
    return discs == 4;
  }
}

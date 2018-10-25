import java.util.ArrayList;

public class Column {
  ArrayList<Player> playerMoves;

  Column(){
    playerMoves = new ArrayList<>();
  }

  void putDisc(Player player){
    playerMoves.add(player);
  }

  int size(){
    return playerMoves.size();
  }
}

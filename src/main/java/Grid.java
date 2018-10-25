import java.util.Arrays;
import java.util.List;

public class Grid {
  private List<Column> columns;

  public Grid() {
    columns = Arrays.asList(
      new Column(), new Column(), new Column(),
      new Column(), new Column(), new Column());
  }

  int columnSizeFor(int column){
   return columns.get(column).size();
  }

  void putDiscInColumn(Player player, int column){
    columns.get(column).putDisc(player);
  }
}

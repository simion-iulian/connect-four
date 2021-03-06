import java.util.Arrays;
import java.util.List;

public class Grid {
  private final int NUMBER_OF_ROWS = 6;

  public List<Column> getColumns() {
    return columns;
  }

  private List<Column> columns;

  public int getLastInsertColumn() {
    return lastInsertColumn;
  }

  private int lastInsertColumn;

  public Grid(){
    columns = Arrays.asList(
      new Column(), new Column(), new Column(),
      new Column(), new Column(), new Column(),
      new Column());
  }

  boolean isColumnFull(int column){
    return columns.get(column).size() == NUMBER_OF_ROWS;
  }

  void putDiscInColumn(Player player, int column){
    columns.get(column).putDisc(player);
    this.lastInsertColumn = column;
  }

}

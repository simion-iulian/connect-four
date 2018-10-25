enum GameStatus {
  PLAYER_HAS_A_TURN("Player %s has a turn"),
  COLUMN_FULL("Column full!");
  private final String statusMessage;

  GameStatus(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  @Override
  public String toString() {
    return statusMessage;
  }
}

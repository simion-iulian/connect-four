enum GameStatus {
  PLAYER_HAS_A_TURN("Player %s has a turn");

  private final String statusMessage;

  GameStatus(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  @Override
  public String toString() {
    return statusMessage;
  }
}

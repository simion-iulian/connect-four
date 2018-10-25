enum Player {
  ONE("1"),
  TWO("2");

  private String number;

  Player(String number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return number;
  }

  Player nextPlayer() {
    if (this == ONE)
      return TWO;
    return ONE;
  }
}

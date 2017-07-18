package dice;

public class DiceData {
  //サイコロの目の最大値
  private final int range;
  //サイコロの数
  private final int number;

  public DiceData(int range, int number) {
    this.range = range;
    this.number = number;
  }

  public int getRange() {
    return range;
  }

  public int getNumber() {
    return number;
  }
}

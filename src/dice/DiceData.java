package dice;

public class DiceData {
  //サイコロの目の最大値
  private final int range;
  //サイコロの数
  private final int number;

  /**
   * @param range サイコロの目の最大値
   * @param number サイコロの数
   * */
  public DiceData(int range, int number) {
    this.range = range;
    this.number = number;
  }

  /**@return サイコロが出す目の最大値*/
  public int getRange() {
    return range;
  }

  /**サイコロの数*/
  public int getNumber() {
    return number;
  }
}

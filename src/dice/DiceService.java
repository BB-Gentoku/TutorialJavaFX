package dice;

import java.util.Random;

public class DiceService {
  private DiceData dice;
  private int result = 0;

  /**
   * @param range サイコロが出す目の最大値
   * @param number サイコロの数
   */
  public DiceService(int range, int number) {
    dice = new DiceData(range, number);
  }

  /**
   * サイコロを1つ振る
   * @return 1 から range の範囲
   */
  private int shake() {
    Random rnd = new Random();
    return rnd.nextInt(dice.getRange()) + 1;
  }

  /**
   * numberの個数サイコロを振る
   * 結果をresultフィールドに格納する
   */
  public void shakeResult() {
    result = 0;
    for (int i = 0; i < dice.getNumber(); i++) {
      result += this.shake();
    }
  }

  /**
   * @return サイコロを振った結果を取得する
   */
  public int getResult() {
    return result;
  }
}

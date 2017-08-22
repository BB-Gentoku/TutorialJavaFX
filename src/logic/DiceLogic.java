package logic;

import java.util.ArrayList;
import java.util.Random;

import data.Dice;

/**
 * サイコロを振った結果を保持、出力するクラス.
 * <p>
 *
 */
public class DiceLogic {
  private Dice dice;
  private ArrayList<Integer> results;

  /**
   * @param range サイコロが出す目の最大値.
   * @param number サイコロの数.
   */
  public DiceLogic(int range, int number) {
    dice = new Dice(range, number);
    results = new ArrayList<Integer>(number);
  }

  /**
   * サイコロを1つ振る.
   * @return 1 から range の範囲.
   */
  private int shake() {
    Random rnd = new Random();
    return rnd.nextInt(dice.getRange()) + 1;
  }

  /**
   * numberの個数サイコロを振る.
   * 結果をresultフィールドに格納する.
   */
  public void shakeResult() {
    results.clear();
    for (int i = 0; i < dice.getNumber(); i++) {
      results.add(this.shake());
    }
  }

  /**
   * 新たにサイコロを振って結果を返す.
   * @return サイコロをnumber個振った結果を取得する.
   */
  public int getResults() {
    shakeResult();

    int sumResult = 0;
    for(int get : results) {
      sumResult += get;
    }
    return sumResult;
  }

  /**
   * 前回振ったサイコロが全てゾロ目かどうかを返す.
   * @return ゾロ目だったらtrue.
   * ゾロ目じゃなかったらfalse.
   */
  public boolean isUniform() {
    int result = results.get(0);
    for(int get : results) {
      if(result != get) {
        return false;
      }
    }
    return true;
  }
}

package dice;

import java.util.Random;

public class DiceService {
  private DiceData dice;

  //サイコロの最大値,サイコロの数
  public DiceService(int range, int number) {
    dice = new DiceData(range, number);
  }

  private int shake() {
    Random rnd = new Random();
    return rnd.nextInt(dice.getRange()) + 1;
  }

  public int getResult() {
    int result = 0;
    for (int i = 0; i < dice.getNumber(); i++) {
      result += this.shake();
    }
    return result;
  }
}

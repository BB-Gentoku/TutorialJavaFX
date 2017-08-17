package director;

import logic.DiceLogic;

/**
 *モノポリーの流れや判断をするクラス
 *<p>
 *
 */
public class MonoporyDirector {
  private DiceLogic dice;

  public MonoporyDirector() {
    dice = new DiceLogic(6,2);
  }
  //サイコロの値を確認するだけ
  public void printDiceResult() {
    for(int i = 0; i < 10; i++) {
      System.out.println((i + 1) + ":" + dice.getResults());

      try{
        Thread.sleep(1000);
      } catch(Exception e) {
        return;
      }
    }
  }

  public static void main(String[] args) {
    MonoporyDirector director = new MonoporyDirector();

    director.printDiceResult();
  }
}



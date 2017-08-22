package logic;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class DiceLogicTest {
  private static DiceLogic dice;

  public static class サイコロを振ったときの範囲を確認する {
    @Before
    public void setup() {
      dice = new DiceLogic(6, 2);
    }

    @Test
    public void サイコロの値が範囲内か確かめる() {
      int number = 100;
      int box[] = new int[number];
      for (int i = 0; i < 100; i++) {
        box[i] = dice.getResults();
      }

      for (int temp : box) {
        //
        assertThat(DiceUtil.closeEquals(temp, 2, 12), is(12));
      }
    }
  }

  public static class ゾロ目かどうかを確かめる {
    @Before
    public void setup() {
      dice = new DiceLogic(1, 3);
    }

    @Test
    public void 振ったサイコロがゾロ目かisUniformで確認する() {
      dice.getResults();
      assertThat(dice.isUniform(), is(true));
    }
  }
}

class DiceUtil {
  public static int closeEquals(int value, int start, int end) {
    if (start <= value && value <= end) {
      return end;
    }
    return value;
  }
}

package dice;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiceServiceTest {

  DiceService dice;

  @Before
  public void setup() {
    dice = new DiceService(6, 2);
  }

  @Test
  public void サイコロの値を確かめる() {
    int number = 100;
    int box[] = new int[number];
    for(int i = 0; i < 100; i++) {
      box[i] = dice.getResult();
    }

    for(int temp:box) {
      //
      assertThat(TestProcess.closeEquals(temp, 2, 12), is(12));
    }

  }

}

class TestProcess {
  public static int closeEquals(int value, int start, int end) {
    if(start <= value && value <= end) {
      return end;
    }
    return value;
  }

}

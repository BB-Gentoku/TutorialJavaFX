package data;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 *
 * プレイヤー人数を制限する処理のテスト.
 */
@RunWith(Enclosed.class)
public class PlayerMountConstructerTest {

  public static class プレイヤーが最大値を超えないかのテスト {

    @Test(expected = IllegalStateException.class)
    public void 生成数がMAX_PLAYER_NUMBERを超えるとIllegalStateExceptionになる()
        throws Exception {
      Player player = new PlayerMount("test", 1, 100);
      for (int i = 0; i < Utility.MAX_PLAYER_NUMBER + 1; i++) {
        player = new PlayerMount("test", 1, 100);
        System.out.println(player.getCode());
      }
    }
  }

}

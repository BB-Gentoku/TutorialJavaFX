package data;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class PlayerMountTest {

  public static class 初期化の処理のテストクラス {
    @Test
    public void コンストラクタが正しく処理されたか確認する()
        throws Exception {
      Player player = new PlayerMount("test", 1, 100);
      assertThat(player.getCode() < Utility.MAX_PLAYER_NUMBER, is(true));
      assertThat(player.getName(), is("test"));
      assertThat(player.getPlace(), is(1));
      assertThat(player.getCash(), is(100));
      assertThat(player.isInJail(), is(false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nameの文字列制限を超えた場合はIllegalArgumentExceptionになる()
        throws Exception {
      Player player = new PlayerMount("12345678901", 1, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 初期座標に負の値を代入するとIllegalArgumentExceptionになる()
        throws Exception {
      Player player = new PlayerMount("test", -1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 初期現金に負の値を代入するとIllegalArgumentExceptionになる()
        throws Exception {
      Player player = new PlayerMount("test", 1, -1);
    }
  }

  public static class 共通の初期化で問題ないテストクラス {
    PlayerMount player;

    @Before
    public void setup()
        throws Exception {
      player = new PlayerMount("test", 0, 0);
    }

    //TODO 給料のテストコードも必要
    @Test
    public void doMoveメソッドでplaceの値に引数の値を加算する() {
      player.doMove(2);
      assertThat(player.getPlace(), is(2));
    }

    @Test
    public void doJampメソッドでplaceを引数の値にする() {
      player.doJump(1);
      assertThat(player.getPlace(), is(1));
    }

    @Test
    public void addCashメソッドで現金を加算する() {
      assertThat(player.addCash(100), is(true));
      assertThat(player.getCash(), is(100));
    }

    @Test
    public void addCashメソッドで現金が負の値になるとfalseが返ってくる() {
      assertThat(player.addCash(-1), is(false));
    }

  }

  public static class 各自で初期化する必要のあるテストクラス {

    @Test
    public void 刑務所に入ってから出てくる処理を確認する()
        throws Exception {
      Player player = new PlayerMount("test", 0, Utility.RELEAS_PRICE);
      player.goJail();
      assertThat(player.isInJail(), is(true));
      assertThat(player.getPlace(), is(Utility.ADDRESS_JAIL));

      player.escapeJail();
      assertThat(player.isInJail(), is(false));

      player.goJail();

      player.releaseJail();
      assertThat(player.isInJail(), is(false));
      assertThat(player.getCash(), is(0));
    }

    public void マップを一周したときに給料を得る処理を確認する()
        throws Exception {
      Player player = new PlayerMount("test", Utility.MAP_SIZE, 0);
      player.doMove(1);
      assertThat(player.getCash(), is(Utility.SALARY));

      player = new PlayerMount("test", Utility.MAP_SIZE, 0);
      player.doJump(1);
      assertThat(player.getCash(), is(Utility.SALARY));
    }
  }
}

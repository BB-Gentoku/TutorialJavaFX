package data;

import java.util.ArrayList;

/**
 * 土地を表すインターフェース.
 * <p>
 * このインターフェースを実装したクラス1つで
 * マス1つを表現する.
 */
public interface Place {

  /**
   * 番地の取得
   * @return 数値で表した番地
   */
  public int getAddress();

  /**
   * 土地名の取得.
   * @return 土地名.
   */
  public String getName();

  /**
   * 土地を踏んだ時のイベント.
   * @param Players プレイヤーのリスト.
   */
  public void doEvents(ArrayList<Player> Players);
}

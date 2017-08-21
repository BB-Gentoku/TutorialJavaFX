package data;

/**
 * プレイヤーのインターフェース.
 * <p>
 */
public interface Player {

  /**
   * プレイヤーコード(int)の取得.
   * @return プレイヤーコード.
   */
  public int getCode();

  /**
   * プレイヤーネームの取得.
   * @return プレイヤーネーム.
   */
  public String getName();

  /**
   * プレイヤーの座標の取得.
   * @return プレイヤーの座標.
   */
  public int getPlace();

  /**
   * プレイヤーの現金残高の取得.
   * @return プレイヤーの現金残高.
   */
  public int getCash();

  /**
   * プレイヤーの現金の変動処理.
   * @param cash 変動する金額.負の数も可.
   * @return 破産したかどうかの判定.
   * 無事ならtrue.
   * 破産したらfalse.
   */
  public boolean addCash(int cash);

  /**
   * サイコロを振ったりイベントによって
   * 一定量進める場合の処理.
   * @param distance 進める距離.
   * @return 止まった土地の番地
   */
  public int doMove(int distance);

  /**
   * イベント等によって
   * 特定の土地に移動する場合の処理.
   * @param address 移動する番地.
   */
  public int doJump(int address);

  /**
   * イベント等によって刑務所に飛ばされる処理.
   * <p>
   * GoJailや
   */
  public void goJail();

  /**
   * 刑務所から釈放される処理.
   * <p>
   * これは50現金を払った場合の処理
   */
  public void releaseJail();

  /**
   * 刑務所から脱獄する処理.
   * <p>
   * サイコロでゾロ目が出た場合の処理
   */
  public void escapeJail();
}

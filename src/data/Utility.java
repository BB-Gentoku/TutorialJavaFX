package data;

public class Utility {
  //初期化前に決める必要のある定数
  /**
   * マスの数.<p>
   * 負の数は初期化の時に例外が投げられる.
   */
  public static final int MAP_SIZE = 40;

  /**
   * プレイヤーの最大数.<p>
   * 2以上の数を想定している.
   * 2未満では、例外は出ないだろうが想定した使い方ではない.
   */
  public static final int MAX_PLAYER_NUMBER = 7;

  /**
   * プレイヤーの名前の文字列の長さ.<p>
   * 実装するUIによって数値を変える.
   */
  public static final int MAX_NAME_LENGTH = 10;

  //初期化するときに必要な定数
  /**
   * 最初のマス.<p>
   * 範囲は 0 ～ MAP_SIZE - 1.
   */
  public static final int FIRST_ADDRESS = 0;
  /**
   * 初期の所持金.<p>
   * 負の数を入れると例外が投げられる.
   */
  public static final int FIRST_CASH = 1500;

  //サイコロの定数
  /**
   * サイコロの出目の最大値.<p>
   * DirectorクラスでDiceLogicを初期化するときに使う.
   * 負の数を入れると例外が投げられる.
   */
  public static final int DICE_RANGE = 6;
  /**
   * サイコロの数
   * DirectorクラスでDiceLogicを初期化するときに使う.
   * 負の数を入れると例外が投げられる.
   */
  public static final int DICE_NUMBER = 2;

  //マップの番地の定数
  /**
   * 刑務所の番地
   */
  public static final int ADDRESS_JAIL = 10;

  //イベントに関する定数
  /**
   * 給料の金額.
   */
  public static final int SALARY = 200;
  /**
   * 保釈に必要な金額.
   */
  public static final int RELEAS_PRICE = 50;
}

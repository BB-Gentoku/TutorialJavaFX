package data;

/**
 *プレイヤーインターフェースを実装したクラス。
 *<p>
 */
public class PlayerMount implements Player {

  //プレイヤーのコード、名前が被っても分かるように
  int code;
  //表示する名前
  String name;
  //プレイヤーがいる座標
  int place;
  //プレイヤーの持つ現金
  int cash;
  //刑務所に入ってるかどうか
  //trueで刑務所暮らし
  //falseでシャバ暮らし
  boolean inJail;

  /**
   * コンストラクタ
   * @param code nameが被った場合でも識別できるようにする変数
   * @param name プレイヤーの表示する名前
   * @param piece 初期座標
   * @param cash 初期現金
   */
  PlayerMount(int code, String name, int piece, int cash) {
    this.code = code;
    this.name = name;
    this.place = piece;
    this.cash = cash;
  }

  public int getCode() {
    return this.code;
  }

  public String getName() {
    return this.name;
  }

  public int getPlace() {
    return this.place;
  }

  public int getCash() {
    return this.cash;
  }

  @Override
  public boolean addCash(int cash) {
    this.cash += cash;
    return this.cash >= 0 ? true : false;
  }

  @Override
  public int doMove(int distance) {
    place += distance;
    if (place < Utility.MAP_SIZE) {
      return place;
    }
    place -= Utility.MAP_SIZE;
    this.addCash(Utility.PAYING);
    return place;
  }

  @Override
  public int doJump(int address) {
    if (place < address) {
      return place = address;
    } else {
      this.addCash(Utility.PAYING);
      return place = address;
    }
  }

  public void goJail() {
    place = Utility.ADDRESS_JAIL;
    inJail = true;
  }

  @Override
  public void releaseJail() {
    this.addCash(-Utility.RELEAS_PRICE);
    inJail = false;
  }

  public void escapeJail() {
    inJail = false;
  }
}

package data;

/**
 *プレイヤーインターフェースを実装したクラス。
 *<p>
 *TODO データと機能を分離する必要あり
 */
public class PlayerMount implements Player {

  //プレイヤーの人数を数えるクラス変数
  //TODO 最大値を定数で宣言する必要あり(コンストラクタのマジックナンバーの解消)
  //TODO テストコードで例外チェックをする必要あり
  private static int playerNumber = 0;

  //プレイヤーのコード、名前が被っても分かるように
  private int code;
  //表示する名前
  private String name;
  //プレイヤーがいる座標
  private int place;
  //プレイヤーの持つ現金
  private int cash;
  //刑務所に入ってるかどうか
  //trueで刑務所暮らし
  //falseでシャバ暮らし
  private boolean inJail;

  /**
   * コンストラクタ
   * code nameが被った場合でも識別できるようにする変数.<p>
   * 0以上7未満の値であること
   * @param name プレイヤーの表示する名前<p>
   * null,空文字でなく、10文字以下であること
   * @param piece 初期座標 自然数<p>
   * 0以上MAP_SIZE未満の値であること
   * @param cash 初期現金
   * 0以上の値であること.無いとは思うけどオーバーフローしないように.
   */
  PlayerMount(String name, int place, int cash)
      throws Exception {
    if (playerNumber > Utility.MAX_PLAYER_NUMBER) {
      throw new IllegalStateException();
    }
    if (name == null || name.equals("") || name.length() > 10) {
      throw new IllegalArgumentException();
    }
    if (place < 0 || place > Utility.MAP_SIZE) {
      throw new IllegalArgumentException();
    }
    if (cash < 0) {
      throw new IllegalArgumentException();
    }

    this.code = playerNumber;
    playerNumber += 1;
    this.name = name;
    this.place = place;
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

  public boolean isInJail() {
    return inJail;
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
    this.addCash(Utility.SALARY);
    return place;
  }

  @Override
  public int doJump(int address) {
    if (place < address) {
      return place = address;
    } else {
      this.addCash(Utility.SALARY);
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

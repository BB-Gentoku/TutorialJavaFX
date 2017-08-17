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
  int piece;
  //プレイヤーの持つ現金
  int cash;

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
    this.piece = piece;
    this.cash = cash;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPiece(int piece) {
    this.piece = piece;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public int getCode() {
    return this.code;
  }

  public String getName() {
    return this.name;
  }

  public int getPiece() {
    return this.piece;
  }

  public int getCash() {
    return this.cash;
  }

  @Override
  public boolean addCash(int cash) {
    this.cash += cash;
    return this.cash >= 0 ? true : false;
  }
}

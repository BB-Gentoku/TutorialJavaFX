package data;

abstract public class PricePlace extends PlaceAbstract {

  //土地の定額
  protected final int price;
  //土地の購入価格
  protected int buyprice;
  //土地を所持するプレイヤーコード
  protected int playerCode;
  //土地を所持するプレイヤーの名前
  protected String playerName;
  //土地が抵当に入れられてるかどうか
  protected boolean mortgageflg;

  /**
   * コンストラクタ.
   * <p>
   *
   * @param address 番地
   * @param name 土地名
   * @param price 定価
   */
  public PricePlace(int address, String name, int price) {
    super(address, name);
    this.price = price;
    this.buyprice = 1;
  }

  public void setBuyPrice(int price) {
    this.buyprice = price;
  }

  public void setPlayerCode(int code) {
    this.playerCode = code;
  }

  public void setPlayerName(String name) {
    this.playerName = name;
  }

  public void setMortgageFlg(boolean flag) {
    this.mortgageflg = flag;
  }

  public int getPrice(int price) {
    return price;
  }

  public int getBuyPrice(int price) {
    return buyprice;
  }

  public int getPlayerCode(int code) {
    return playerCode;
  }

  public String getPlayerName(String name) {
    return playerName;
  }

  /**
   * 抵当に入っているかどうか。
   * <p>
   * @return 抵当に入ってたらtrue.
   * 入っていなかったらfalse.
   */
  public boolean isMortgage() {
    return mortgageflg;
  }
}

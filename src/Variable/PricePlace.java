package Variable;

abstract public class PricePlace extends Place {
  protected int price;
  protected int buyprice;
  protected int playerCode;
  protected String playerName;
  protected boolean mortgageflg;

  public int Buy(int playerCode, String playerName) {
    this.playerCode = playerCode;
    this.playerName = playerName;
    return buyprice;
  }

  public void Auction(int price) {

  }

  public int mortgage() {
    return price / 2;
  }
}

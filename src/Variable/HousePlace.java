package Variable;

public class HousePlace extends PricePlace {
  HousePlace(int address, String name, int price) {
    this.address = address;
    this.name = name;
    this.price = price;
    this.playerCode = -1;
    this.playerName = "";
    this.mortgageflg = false;
  }
}

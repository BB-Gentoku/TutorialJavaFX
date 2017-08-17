package data;

/**
 * Placeを実装した抽象クラス
 * <p>
 */
abstract public class PlaceAbstract implements Place {
  protected int address;
  protected String name;

  /**
   * コンストラクタ。
   * @param address
   * @param name
   */
  public PlaceAbstract(int address, String name) {
    this.address = address;
    this.name = name;
  }

  public void setAddress(int address) {
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAddress() {
    return address;
  }

  public String getName() {
    return name;
  }
}

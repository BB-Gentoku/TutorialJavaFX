package data;

import java.util.ArrayList;

/**
 * 家を建てられる土地のクラス.
 * <p>
 */
public class HousePlace extends PricePlace {

  //建っている家の数
  protected int houseNumber;
  //家1軒の購入額
  protected int housePrice;
  //土地停止時の徴収金額のリスト
  protected ArrayList<Integer> houseRegain = new ArrayList<>();

  /**
   * コンストラクタ。
   * <p>
   * 検討中
   * @param address 住所。番地。いらないかもしれない
   * @param name 都市名。必要
   * @param price 地価。抵当に入れるときも使う。
   * @param housePrice 購入時の金額。オークションや取引で使う。
   * @param houseRegain 土地に泊まった時の徴収金額
   * 0～5まであるサイズ6の予定。
   */
  public HousePlace(int address, String name, int price,
      int housePrice, ArrayList<Integer> houseRegain) {
    super(address, name, price);
    this.housePrice = housePrice;
    this.houseRegain = houseRegain;
  }

  /**
   * 定額で購入した場合。作成途中。
   * <p>
   * 要：プレイヤーネームとコードの入力。
   * @return 消費金額
   */
  public int buyHouse() {
    houseNumber++;
    return -housePrice;
  }

  /**
   * 抵当に出した時の処理。
   * 買い戻した時の処理が必要。
   * <p>
   * @return 定額の半分の金額
   */
  public int lendHouse() {
    houseNumber--;
    return housePrice / 2;
  }

}

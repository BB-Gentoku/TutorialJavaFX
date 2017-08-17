package data;

/**
 * プレイヤーのインターフェース。
 * <o>
 */
public interface Player {

  public int getCode();

  public String getName();

  public int getPiece();

  public int getCash();

  public boolean addCash(int cash);

}

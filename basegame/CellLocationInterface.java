package basegame;

public interface CellLocationInterface {
    public void setCoordinates(int[] newCoordinates);
    public int[] getCoordinates();
    public int getRow();
    public int getColumn();
}
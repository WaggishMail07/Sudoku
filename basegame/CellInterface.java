package basegame;

public interface CellInterface {
    public void setValue(int newValue);
    public int getValue();
    public String getDisplayValue();
    public void setCorrectValue(int newCorrectValue);
    public int getCorrectValue();
    public String getCorrectDisplayValue();
    public void setOriginal(boolean newOriginal);
    public boolean isOriginal();
    public default boolean isWorking() {System.out.print("YAY"); return true;}
}
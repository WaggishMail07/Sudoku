package basegame;


public class Cell implements CellInterface, CellLocationInterface {
    // declare attributes
    private int value;
    private int correctValue;
    private int maxValue;
    private boolean original;
    private int[] coordinates = new int[2];



    // CONSRUCTORS


    // no argument cnstructor
    public Cell() {
        this.value = 0;
        this.correctValue = -1;
        this.original = false;
        this.coordinates[0] = -1;
        this.coordinates[1] = -1;
    }


    // constructor without "correctValue" or "original"
    public Cell(int newValue, boolean isOriginal, int[] newCoordinates) {
        this(newValue, -1, isOriginal, newCoordinates);
    }


    // full argument constructor
    public Cell(int newValue, int newCorrectValue, boolean isOriginal, int[] newCoordinates) {
        // validate newValue
        if (valueIsValid(newValue)) {this.value = newValue;}

        // validate newCorrectValue
        if (valueIsValid(newCorrectValue)) {this.correctValue = newCorrectValue;}

        // initialize original
        this.original = isOriginal;

        // validate cooridinates
        if (coordsAreValid(newCoordinates)) {this.coordinates = newCoordinates;}
    }



    // SETTERS AND GETTERS


    // setter for value
    @Override
    public void setValue(int newValue) 
    {if (valueIsValid(newValue)) {this.value = newValue;}}
    // getter for value
    @Override
    public int getValue() {return value;}
    // getter for display value
    @Override
    public String getDisplayValue() {return Integer.toString(value);}

    // setter for correct value
    @Override
    public void setCorrectValue(int newCorrectValue) 
    {if (valueIsValid(newCorrectValue)) {}}
    // getter for correct value
    @Override
    public int getCorrectValue() {return correctValue;}
    // getter for correct display value
    @Override
    public String getCorrectDisplayValue() {return Integer.toString(correctValue);}
    
    // setter for original
    @Override
    public void setOriginal(boolean newOriginal) {this.original = newOriginal;}
    // getter for original
    @Override
    public boolean isOriginal() {return original;}
    
    // setter for coordinates
    @Override
    public void setCoordinates(int[] newCoordinates) 
    {if (coordsAreValid(newCoordinates)) {this.coordinates = newCoordinates;}}
    // getter for coordinates
    @Override
    public int[] getCoordinates() {return coordinates;}
    // getter for row
    @Override
    public int getRow() {return coordinates[1];}
    // getter for column
    @Override
    public int getColumn() {return coordinates[0];}
    


    // STATIC DATA VALIDATION


    // data validation for int "value" (many attributes are limited to 1-9 so this validation is used for many attributes)
    private static boolean valueIsValid(int newValue) {
        if (newValue == -1 || (0 < newValue && newValue <= 9)) {return true;} 
        else {
            throw new IllegalArgumentException("valid values are 1-9, not " + newValue);
        }
    }
    // overloaded version for slightly more advanced error messages
    private static boolean valueIsValid(int newValue, String valueName) {
        try {
            return valueIsValid(newValue);    
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("for " + valueName + " " + newValue + " is not a valid value, it must be 1-9");
        }
    }


    private static boolean coordsAreValid(int[] newCoords) {
        if (0 < newCoords[0] && newCoords[0] <= 9 && 0 < newCoords[1] && newCoords[1] <= 9) {return true;}
        else {
            throw new IllegalArgumentException("valid values for coordinates are 0-8, not " + newCoords);
        }
    }

}
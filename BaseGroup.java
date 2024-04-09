/* discontinued, merely an artifact*/
package discontinued;


import java.util.ArrayList;

import basegame.BaseCell;
import basegame.Cell;
import cells.*;


public class BaseGroup implements GroupLocation {
    // declare attributes
    //  1st dimension = row, 2nd dimension = column
    private ArrayList<ArrayList<Cell>> cells = new ArrayList<ArrayList<Cell>>(9);
    private boolean complete;



    // CONSTRUCTORS


    // no arguument constructor
    public BaseGroup() {
        for (int I = 0; I < 9; I++) {
            cells.set(I, new ArrayList<Cell>(0));
            for (int i = 0; i < 9; i++) {
                int[] coords = {I, i};
                int[] groupCoords = {-1, -1};
                cells.get(I).set(i, new BaseCell(-1, complete, coords, groupCoords));
            }
        }
    }

    // coords only constructor
    public BaseGroup(newGroupCoords) {

    }
    
}

    // SETTERS AND GETTERS

    //STATIC DATA VALIDATION
}
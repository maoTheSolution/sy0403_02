import java.util.*;

public class Screen {
    private ArrayList<Pixel> data[];
    private int numRows;
    private int numCols;

    public Screen(int width, int height){
        numRows = width;
        numCols = height;
        data = new ArrayList<Pixel>[numRows];
    }
    public static void main(String [] args){
        Screen s = new Screen(10, 5);
        s.pixelOn(3, 3);
    }   
    
    public void pixelOn(int row, int col){
        data[row].add(col, new Pixel(row, col));
    }
}

class Pixel{
    int row;
    int col;

    Pixel(int row, int col){
        this.row = row;
        this.col = col;
    }
}

package Week06;

public class FRQ01 {
    public static void main(String [] arsg){
        Show show = new Show();
        show.printTable();

        // show.isAisleSeat(2,5);
        // show.isAisleSeat(0,4);
        // show.isAisleSeat(1,0);
        
        show.twoTogether();
        show.printTable();

        // show.findAdjacent(0,3);
        // show.findAdjacent(1,3);
        // show.findAdjacent(2,2);
        // show.findAdjacent(1,5);

    }
}


class Show{
    /*
     * The seats for this show
     */
    private int[][] seats;
    private final int SEATS_PER_ROW = 6;
    private final int NUM_ROWS = 3;

    Show(){
        seats = new int[NUM_ROWS][SEATS_PER_ROW];
        seats[0][0] = 0;
        seats[0][1] = 0;
        seats[0][2] = 1;
        seats[0][3] = 1;
        seats[0][4] = 1;
        seats[0][5] = 1;

        seats[1][0] = 0;
        seats[1][1] = 1;
        seats[1][2] = 0;
        seats[1][3] = 1;
        seats[1][4] = 0;
        seats[1][5] = 1;

        seats[2][0] = 1;
        seats[2][1] = 0;
        seats[2][2] = 0;
        seats[2][3] = 0;
        seats[2][4] = 0;
        seats[2][5] = 0;

        //----------------

        // seats[0][0] = 0;
        // seats[0][1] = 1;
        // seats[0][2] = 1;
        // seats[0][3] = 0;
        // seats[0][4] = 0;
        // seats[0][5] = 0;

        // seats[1][0] = 0;
        // seats[1][1] = 0;
        // seats[1][2] = 0;
        // seats[1][3] = 0;
        // seats[1][4] = 1;
        // seats[1][5] = 1;

        // seats[2][0] = 1;
        // seats[2][1] = 0;
        // seats[2][2] = 0;
        // seats[2][3] = 1;
        // seats[2][4] = 0;
        // seats[2][5] = 0;
    }

    /*
     * Returns true if the seat with the specified row and
     * seat number is an aisle seat, false otherwise.
     * @param row the row number
     * @param seatNumber the seat number
     * @return true if an aisle seat, false otherwise
     */
    public boolean isAisleSeat(int row, int seatNumber){
        boolean con = false;
        int cnt = 0;

        for(int col=0; col<SEATS_PER_ROW; col++){
            if(seats[row][col] == 0){     // found an empty seat
                if(seatNumber == 0){      // looking for a single seat
                    con=true;
                    break;
                }else{                  // looking for adjacent seats
                    cnt++;
                    if(cnt == seatNumber){
                        con = true;
                        break;
                    }
                }
            }else{                     // found a seat which is occupied
                cnt=0;
            }
        }
        System.out.println("show.isAisleSeat("+row+","+seatNumber+")"+"\t"+con);
        return con;
    }

    /*
     * Reserve two adjacent seats and return true if this was
     * suceessfully done.
     * If two adjacent seats could not be found, leave the state
     * of the show unchanged, and return false.
     * @return true if two adjacent seats were found, false otherwise.
     */
    public boolean twoTogether(){
        int rowFound = -1;
        int colFound = -1;
        boolean con = false;
        // find the row to make a change
        for(int row=0; row<NUM_ROWS; row++){
            if(isAisleSeat(row, 2)){
                rowFound = row;
                con = true;
                break;        
            }
        }

        if(con){
            colFound = findAdjacent(rowFound, 2);
            if(colFound == -1){
                con = false;
            } else{
                seats[rowFound][colFound] = 1;
                seats[rowFound][colFound+1] = 1;
            }
        }
        System.out.println(con);
        return con;
    }

    /*
    * Return the lowest seat number in the specified row for a block of
    * empty adjacent seats. If no such block exists, return -1.
    * @param row the row number
    * @param seatsNeeded the number of adjacent empty seats needed
    * @return lowest seat number for a block of needed adjacent seats or
    * -1 if no such block exists.
    */
    public int findAdjacent(int row, int seatsNeeeded){
        int colFound = -1;
        int cnt = 0;
        if(isAisleSeat(row, seatsNeeeded)){
            for(int col=0; col<SEATS_PER_ROW; col++){
                if(seats[row][col] == 0){
                    cnt++;
                    if(cnt == seatsNeeeded){
                        colFound = col;
                        break;
                    }
                } else{
                    cnt = 0;
                }
            }
            System.out.println(colFound-(seatsNeeeded-1));
            return colFound-(seatsNeeeded-1);
        } else{
            System.out.println(colFound);
            return colFound;
        }

    }
    // There may be instance variables, constructors, and methods that are
    // not shown.

    /**
     * Show the table
     */
    public void printTable(){
        System.out.print("\t");
        for(int i=0; i<SEATS_PER_ROW; i++){
            System.out.print("["+i+"]"+"\t");
        }
        System.err.println();

        for(int i=0; i<NUM_ROWS; i++){
            System.out.print("[" + i + "]" + "\t");
            for(int j=0; j<SEATS_PER_ROW; j++){
                System.out.print(" " + seats[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

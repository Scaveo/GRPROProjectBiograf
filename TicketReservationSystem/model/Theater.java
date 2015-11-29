package model;

/**
 * Created by Tobias Scavenius on 29-11-2015.
 */
public class Theater {

    private boolean[][] seats;

    public Theater(int maxNumber) {

        this.seats = new boolean[maxNumber][maxNumber];

    }

    // A default constructor
    public Theater() {

        this.seats = new boolean[15][15];

    }

    public boolean[][] getSeats() {
        return seats;
    }

    public boolean getSpecificSeat(int row, int column) {
        return seats[row][column];
    }

    public void flipReservation(int row, int column) {
        seats[row][column] = !seats[row][column];
    }

}
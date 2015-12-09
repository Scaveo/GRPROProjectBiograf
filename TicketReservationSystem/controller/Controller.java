package controller;

import model.*;

import java.util.ArrayList;

/**
 * Created by Mikkel on 12/1/2015.
 */
public class Controller {

    private Reservations reservations;
    //private ArrayList<Reservation> reservations;
    private Shows shows;

    public Controller(){

        this.reservations = new Reservations();
        this.shows = new Shows();

    }

    public Reservation createReservation(Show show, Customer customer, ArrayList<int[]> seats) {

        Theater theaterReservedOn = show.getTheater();

        for (int i = 0; i < seats.size(); i++) {

            int[] seat = seats.get(i);

            // the seat is numbered a tuple (column, row)
            theaterReservedOn.flipReservation(seat[0],seat[1]);

        }

        return new Reservation(show, customer, seats);

    }

    public void addreservation(Reservation reservation) {

        reservations.add(reservation);

    }

    public Reservation findReservation(Customer customer, Show show) {

        for (Reservation r: reservations.getReservationList()) {

            if(customer.equals(r.getCustomer()) && show.equals(r.getShow())) {

                return r;

            }

        }

        System.out.println("Controller.findReservation: No reservation found");
        return null;

        }

    public void changeReservation(Customer customer, Show show, int[][] seats) {

        for (Reservation r: reservations.getReservationList()) {

            if(customer.equals(r.getCustomer()) && show.equals(r.getShow())) {

                r.changeReservation(seats);

            }

        }

    }



}

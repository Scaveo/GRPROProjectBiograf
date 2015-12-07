package controller;

import model.Customer;
import model.Reservation;
import model.Show;

import java.util.ArrayList;

/**
 * Created by Mikkel on 12/1/2015.
 */
public class Controller {
    private model.Reservation reservation;
    private ArrayList<Reservation> reservations;


    public void Controller(){

    }

    public void addreservation(Reservation reservation) {

        reservations.add(reservation);

    }

    public Reservation findReservation(Customer customer, Show show) {

        for (Reservation r: reservations) {

            if(customer.equals(r.getCustomer()) && show.equals(r.getShow())) {

                return r;

            }

        }

        System.out.println("Controller.findReservation: No reservation found");
        return null;

        }

    public void changeReservation(Customer customer, Show show, int[][] seats) {

        for (Reservation r: reservations) {

            if(customer.equals(r.getCustomer()) && show.equals(r.getShow())) {

                r.changeReservation(seats);

            }

        }

    }



}

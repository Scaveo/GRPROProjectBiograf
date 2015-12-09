package model;

import controller.Instanciator;

import java.util.ArrayList;

/**
 * Created by scavenius on 12/8/15.
 */
public class Shows {

    private ArrayList<Show> shows;

    public Shows() {

        shows = Instanciator.createShowlist();

    }

    public void addShow(Show show) {

        shows.add(show);

    }

    public void deleteShow(Show show) {

        shows.remove(show);

    }

}

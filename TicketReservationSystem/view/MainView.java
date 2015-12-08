package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Olaleo on 01-12-2015.
 */
public class MainView extends JFrame implements ActionListener
{
    private ReserveView reserveView;
    private ShowView showView;

    public MainView(String title) throws HeadlessException
    {
        super(title);
        initialize();
    }


    public void initialize()
    {
        reserveView = new ReserveView(this);
        showView = new ShowView();
        setSize( 600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(showView);
        setVisible(true);
        showView.addMainView(this);
        //reserveView.addMainView(this);
        //reserveView.changeFilm("test");
    }

    public void changeView()
    {
        if (getContentPane().equals(reserveView.getContentPane()))
        {
            setContentPane(showView);
        }
        else if (getContentPane().equals(showView))
        {
            setContentPane(reserveView.getContentPane());
        }
        pack();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (reserveView.isChangeView())
        {
            changeView();
        }
        if (e.getSource().equals(showView.chooseShow))
        {
            changeView();
        }
        /*
        if (e.getSource().equals(reserveView.getCancelButton()))
        {
            System.out.println("Succes");
        }*/
    }
}




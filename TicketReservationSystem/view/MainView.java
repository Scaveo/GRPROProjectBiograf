package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Olaleo on 01-12-2015.
 */
public class MainView extends JFrame
{
    private ReserveView reserveView;
    private ShowView showView;
    private JFrame window;

    public MainView(String title) throws HeadlessException
    {
        super(title);
        initialize();
    }

    public void initialize()
    {
        reserveView = new ReserveView();
        showView = new ShowView();
        //window = new JFrame();
        setSize( 600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(showView);
        setVisible(true);
    }

    public void changeView()
    {
        if (getContentPane().equals(reserveView))
        {
            setContentPane(showView);
        }
        else if (getContentPane().equals(showView))
        {
            setContentPane(reserveView);
        }
        setVisible(true);
    }

}




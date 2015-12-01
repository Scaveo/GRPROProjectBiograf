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
    private JFrame frame;
    JFrame window;

    public MainView(String title) throws HeadlessException
    {
        super(title);
        initialize();
    }

    public void initialize()
    {
        reserveView = new ReserveView();
        showView = new ShowView();
        window = new JFrame();
        window.setSize( 600, 400);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().add(reserveView);
        window.setVisible(true);
    }

    public void changeView()
    {
        if (window.getContentPane()==reserveView)
        {
            window.setContentPane(showView);
        }
        else if (window.getContentPane()==showView)
        {
            window.setContentPane(reserveView);
        }
    }

}




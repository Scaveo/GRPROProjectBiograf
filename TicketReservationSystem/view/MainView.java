package view;

import javax.swing.*;

/**
 * Created by Olaleo on 01-12-2015.
 */
public class MainView extends JComponent
{
    private ReserveView reserveView;
    private ShowView showView;
    private JFrame frame;
    JFrame window;

    public void initialize()
    {
        window = new JFrame();
        window.setSize( 600, 400);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().add(reserveView);
        window.setVisible(true);
    }

    public void changeView()
    {
        window.setContentPane(showView);
    }

}




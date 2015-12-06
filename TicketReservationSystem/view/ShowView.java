package view;
import javax.swing.*;

/**
 * Created by Olaleo on 01-12-2015.
 */
public class ShowView extends JComponent
{
    JButton chooseShow;

    public ShowView()
    {

        chooseShow = new JButton("Show");
        chooseShow.setSize(100,100);
        add(chooseShow);
        setVisible(true);

    }

    public void addMainView(MainView mainView)
    {
        chooseShow.addActionListener(mainView);
    }


}

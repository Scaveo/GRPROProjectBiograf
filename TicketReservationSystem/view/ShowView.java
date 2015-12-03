package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Olaleo on 01-12-2015.
 */
public class ShowView extends JComponent
{
    public ShowView()
    {

        JButton chooseShow = new JButton("Choose");
        chooseShow.setSize(100,100);
        add(chooseShow);
        setVisible(true);
    }


}

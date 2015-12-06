package view;

import javax.swing.*;

/**
 * Created by Olaleo on 06-12-2015.
 */
public class ReserveViewForm extends JComponent
{
    private JTextField name;
    private JTextField number;
    private JButton save;
    private JButton get;
    private JButton delete;
    private JLabel theater;
    private JLabel film;
    private JLabel time;
    private JPanel rootPanel;

    public ReserveViewForm()
    {
        setVisible(true);
    }
}

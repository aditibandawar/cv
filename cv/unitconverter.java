import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter extends Applet implements ActionListener {
    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;
    Choice choice1, choice2;

    public void init() {
        l1 = new Label("Enter the value: ");
        l2 = new Label("Result: ");
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Convert");
        b2 = new Button("Clear");
        choice1 = new Choice();
        choice2 = new Choice();

        choice1.add("Centimeters");
        choice1.add("Meters");
        choice1.add("Millimeters");
        choice1.add("Kilometers");

        choice2.add("Centimeters");
        choice2.add("Meters");
        choice2.add("Millimeters");
        choice2.add("Kilometers");

        add(l1);
        add(t1);
        add(choice1);
        add(l2);
        add(t2);
        add(choice2);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent)

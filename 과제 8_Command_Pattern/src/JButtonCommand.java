import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JButtonCommand extends JButton {
  Calculator calculator;
  JLabel display;

  public JButtonCommand(String text, Dimension dimension, ActionListener alistener, Calculator cal, JLabel disp) {
    super(text);
    setPreferredSize(dimension);
    addActionListener(alistener);

    this.calculator = cal;
    this.display = disp;
  }
}
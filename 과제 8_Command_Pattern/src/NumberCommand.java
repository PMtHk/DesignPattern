import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NumberCommand extends JButtonCommand implements Command {
  NumberCommand(String text, Dimension dimension, ActionListener alistener, Calculator cal, JLabel disp) {
    super(text, dimension, alistener, cal, disp);
  }

  public void execute() {
    if (!calculator.isOperand1Set()) {
        int num1 = Integer.parseInt(getText());
        display.setText("" + num1);
        calculator.setOperand1(num1);
        calculator.setOperand1Set(true);
    } else if (calculator.isOperand1Set() && calculator.isOperatorSet()) {
        int num2 = Integer.parseInt(getText());
        calculator.setOperand2(num2);
        display.setText("" + num2);
        calculator.setOperand2Set(true);
    }
}
}

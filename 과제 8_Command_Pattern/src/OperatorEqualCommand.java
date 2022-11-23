import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OperatorEqualCommand extends JButtonCommand implements Command {
  public OperatorEqualCommand(String text, Dimension dimension, ActionListener alistener, Calculator cal, JLabel disp) {
    super(text, dimension, alistener, cal, disp);
  }

  public void execute() {
    int result = 0;
    if (calculator.isOperand1Set() && calculator.isOperand2Set() && calculator.isOperatorSet()) {
      if (calculator.getOperator() == '+') {
        result = calculator.getOperand1() + calculator.getOperand2();
      } else if (calculator.getOperator() == '-') {
        result = calculator.getOperand1() - calculator.getOperand2();
      } else if (calculator.getOperator() == '*') {
        result = calculator.getOperand1() * calculator.getOperand2();
      } else if (calculator.getOperator() == '/') {
        result = calculator.getOperand1() / calculator.getOperand2();
      }
    }
    display.setText("" + result);
    calculator.clearFlags();
  }
}

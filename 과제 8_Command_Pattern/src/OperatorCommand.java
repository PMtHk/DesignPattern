import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OperatorCommand extends JButtonCommand implements Command {
  public OperatorCommand(String text, Dimension dimension, ActionListener alistener, Calculator cal, JLabel disp) {
    super(text, dimension, alistener, cal, disp);
  }

  public void execute() {
    if (calculator.isOperand1Set()) { // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
      calculator.setOperatorSet(true);
      calculator.setOperator(getText().charAt(0));
    }
  }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldWindow extends FrameWindow implements Observer { // 옵저버 구현
    private JTextField textField;

    public TextFieldWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
    }

    public void updateText(String msg) {
        textField.setText(msg);
        textField.validate();
    }

    public void update(int value) { //updateText 로 구현하면 필요없는 부분.
        updateText("" + value);
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        textField = new JTextField();
        panel.add(textField);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }
}

import javax.swing.*;
import java.awt.*;

public class WeatherDisplay extends DisplayDecorator {
  JPanel panel;
  Display displayComponent;
  LabelPanel labelPanel;

  public WeatherDisplay(Display display, int width, int height) {
    super(display, width, height);
    this.displayComponent = display;
  }
  
  public JPanel create() {
    // 레이블을 담을 패널 생성
    panel = new JPanel();
    // 레이블 또는 다른 패널이 추가될 때 세로 방향으로 나열되도록 레이아웃 설정
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    // 최소 크기와 선호하는 크기를 동일하게 만들어서 패널 너비와 높이를 고정 시킴
    panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
    panel.setPreferredSize(new Dimension(getWidth(), getHeight()));

    // 기존 display를 감싸기 위한 작업.
    JPanel subpanel = displayComponent.create();
    panel.add(subpanel);

    // 문자열을 보일 레이블 생성
    labelPanel = new LabelPanel();
    // 패널에 레이블을 붙임. 
    panel.add(labelPanel.createPanel(getWidth(), getHeight()));
    return panel;
  }

  public void show() {
    displayComponent.show();
    labelPanel.updateText("Weather Display Works!");
  }

  public int getHeight() {
    return displayComponent.getHeight() + super.getHeight();
  }
}

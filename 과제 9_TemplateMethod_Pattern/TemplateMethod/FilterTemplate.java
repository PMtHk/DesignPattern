import java.awt.image.*;
// import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;

public abstract class FilterTemplate {
  public void makeNewImage(String fileName) {
    try {
      BufferedImage image = ImageIO.read(new File(fileName));
      for (int y = 0; y < image.getHeight(); y++) {
        for (int x = 0; x < image.getWidth(); x++) {
          // (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
          Color color = new Color(image.getRGB(x, y));
          // 이후 동작은 필터별로 상이하다.
          image.setRGB(x, y, applyFilter(color).getRGB());
          // applyfilter를 concrete 클래스에서 구현하도록
        }
      }

      // 이후 파일 출력
      ImageIO.write(image, "png", new File(getFilterName() + fileName));
      // getFilterChar 로 g, i, s 를 받도록 만들자.
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public abstract Color applyFilter(Color color);
  public abstract String getFilterName();
}
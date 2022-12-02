import java.awt.image.*;
// import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;

// 흑백 영상으로 변환하는 코드
class FilterImage {
  public static void main(String[] args) {
    final String HOUSE = "house.png"; // 원본 영상 파일 이름

    FilterTemplate ft = new GreyFilter();
    ft.makeNewImage(HOUSE);

    ft = new InverseFilter();
    ft.makeNewImage(HOUSE);

    ft = new SepiaFilter();
    ft.makeNewImage(HOUSE);
  }
}
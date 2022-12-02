import java.awt.image.*;
// import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;

public class InverseFilter extends FilterTemplate {
  public Color applyFilter(Color color) {
    int outputRed = 255 - color.getRed();
    int outputGreen = 255 - color.getGreen();
    int outputBlue = 255 - color.getBlue();
    return new Color(outputRed, outputGreen, outputBlue);
  }

  public String getFilterName() {
    return "i_";
  }
}
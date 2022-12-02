import java.awt.image.*;
// import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;

public class GreyFilter extends FilterTemplate {
  public Color applyFilter(Color color) {
    int outputRed = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
    int outputGreen = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
    int outputBlue = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
    return new Color(outputRed, outputGreen, outputBlue);
  }

  public String getFilterName() {
    return "g_";
  }
}
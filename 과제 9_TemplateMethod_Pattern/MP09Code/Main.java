import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final String HOUSE = "house.png";
        final String ext = "png";

        ImageConverter[] converters = { new GreyImageConverter(),
                new SepiaImageConverter(), new InverseImageConverter() };
        String[] prefixes = { "g_", "s_", "i_" };

        for (int i = 0; i < converters.length; i++) {
            converters[i].convert(HOUSE, prefixes[i], ext);
        }
    }
}
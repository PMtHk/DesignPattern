import javax.swing.*;

public abstract class DisplayDecorator extends Display {
    /**
     * @param display
     * @param width
     * @param height
     */
    DisplayDecorator(Display display, int width, int height) {
        super(width, height);
    }
}


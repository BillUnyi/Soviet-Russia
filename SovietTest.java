import java.awt.*;
import java.applet.*;
import java.awt.image.ImageObserver;

public class SovietTest extends Applet {

    private Image image;

    public void init() {
        super.setSize(1280, 720);
        image = getImage(getDocumentBase(), "Soviet Union.png");
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(image, 0, 0, 1280, 720, this);
        SovietUnion russia = new SovietUnion(100, image, g2);
        russia.drawSovietUnion(g2, new Color(59, 119, 58));
    }
}

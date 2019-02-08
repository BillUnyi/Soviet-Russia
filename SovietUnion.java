import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.Random;

public class SovietUnion {

    private Russian russians[];
    private Image background;
    private int num;

    public SovietUnion(int n, Image b, Graphics2D g) {

        this.num = n;
        this.background = b;
        this.russians = new Russian [num];
        Random random = new Random();
        for (int i = 0; i < num / 2; i++) {
            russians[i] = new Russian(random.nextInt(96) + 5, "Test", "Male", g, Color.green, random.nextInt(1080) + 50, random.nextInt(520) + 10);
        }
        for (int i = num / 2; i < num - 1; i++) {
            russians[i] = new Soldier(random.nextInt(33) + 18, "Test", "Male", g, Color.blue, random.nextInt(1080) + 50, random.nextInt(520) + 100,
                    "Sargent", "Space Force", 25);
        }
        russians[num - 1] = new General(random.nextInt(41) + 40, "Test", "Male", g, Color.red, random.nextInt(1080) + 50, random.nextInt(520) + 100,
                "General", "Space Force", 25, 1000000);
    }

    public void drawSovietUnion(Graphics2D g) {
        g.drawImage(background, 0, 0, 1280, 720, null);
        for (int i = 0; i < num; i++) {
            russians[i].drawRussian(g);
        }
    }
}
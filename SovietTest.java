import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class SovietTest extends Applet {

    public void init() {
        super.setSize(1080, 720);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Scanner input = new Scanner(System.in);
        SovietUnion russia = new SovietUnion(5, 50, g2);
        russia.drawSovietUnion(g2);
        int num;
        boolean stop = false;
        while(!stop) {
            num = input.nextInt();
            if ((num >= 0) && (num < russia.getNumRussians() + russia.getNumSoldiers() + 1)) {
                russia.textBox(num, g2);
            }
            else if (num < 0) {
                stop = true;
            }
        }
    }
}
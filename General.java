import java.awt.*;

public class General extends Soldier {
    private int numOfTroops;

    public General(int a, String fn, String ln, String gen, Graphics g, Color sc, Color uc, Color hc, int x1, int y1, String r, String b, int y, int numOfT) {
        super(a, fn, ln, gen, g, sc, uc, hc, x1, y1, r, b, y);
        this.numOfTroops = numOfT;
    }

    public int getNumOfTroops() { return numOfTroops; }

    public void setNumOfTroops(int numOfTroops) { this.numOfTroops = numOfTroops; }

    public String greeting() {
        return super.greeting() + " I am currently under the command of " + getNumOfTroops() + " troops.";
    }

    public void drawRussian(Graphics2D g) {
        this.drawTorso(g);
        this.drawShoes(g);
        this.drawLegs(g);
        this.drawFace(g);
        this.drawHair(g);
        this.drawHat(g);
    }

    public void drawHat(Graphics2D g) {
        g.setColor(Color.black);
        g.fillOval(getX1() - 1, getY1() + 3, 22, 5);
        g.setColor(Color.red);
        Polygon hat = new Polygon();
        hat.addPoint(getX1() - 1, getY1() + 5);
        hat.addPoint(getX1() - 3, getY1() - 1);
        hat.addPoint(getX1() + 23, getY1() - 1);
        hat.addPoint(getX1() + 21, getY1() + 5);
        g.fillPolygon(hat);
        g.setColor(Color.black);
        g.drawPolygon(hat);
        g.setColor(Color.yellow);
        g.fillOval(getX1() + 5, getY1() + 1, 10, 2);
    }
}
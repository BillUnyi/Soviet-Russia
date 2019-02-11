import java.awt.*;

public class Russian {
    private int age;
    private String name;
    private String gender;
    private Color skinColor;
    private Color torsoColor;
    private Color legColor;
    private int x1;
    private int y1;

    public Russian(int a, String n, String gen, Graphics g, Color sc, Color tc, Color lc, int x1, int y1) {
        this.age = a;
        this.name = n;
        this.gender = gen;
        this.skinColor = sc;
        this.torsoColor = tc;
        this.legColor = lc;
        this.x1 = x1;
        this.y1 = y1;
    }

    public int getAge() { return age; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public Color getSkinColor() { return skinColor; }
    public Color getTorsoColor() { return torsoColor; }
    public Color getLegColor() { return legColor; }
    public int getX1() { return x1; }
    public int getY1() { return y1; }

    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setSkinColor(Color skinColor) { this.skinColor = skinColor; }
    public void setTorsoColor(Color torsoColor) { this.torsoColor = torsoColor; }
    public void setLegColor(Color legColor) { this.legColor = legColor; }
    public void setX1(int x1) { this.x1 = x1; }
    public void setY1(int y1) { this.y1	= y1; }

    public void greeting() {
        System.out.println("Hello Comrade, my name is " + this.name + ". i am a " + this.gender + ". I am " + this.age + " years old.\n");
    }

    public void drawFace(Graphics g) {
        g.setColor(Color.black);
        Polygon faceOutline = new Polygon();
        faceOutline.addPoint(this.getX1() - 1, this.getY1() + 5);
        faceOutline.addPoint(this.getX1() + 9, this.getY1());
        faceOutline.addPoint(this.getX1() + 20, this.getY1() + 5);
        faceOutline.addPoint(this.getX1() + 18, this.getY1() + 20);
        faceOutline.addPoint(this.getX1() + 9, this.getY1() + 25);
        faceOutline.addPoint(this.getX1() + 1, this.getY1() + 20);
        g.fillPolygon(faceOutline);
        g.setColor(this.getSkinColor());
        Polygon face = new Polygon();
        face.addPoint(this.getX1() + 1, this.getY1() + 6);
        face.addPoint(this.getX1() + 9, this.getY1() + 2);
        face.addPoint(this.getX1() + 18, this.getY1() + 6);
        face.addPoint(this.getX1() + 17, this.getY1() + 19);
        face.addPoint(this.getX1() + 9, this.getY1() + 23);
        face.addPoint(this.getX1() + 2, this.getY1() + 19);
        g.fillPolygon(face);
        g.setColor(Color.black);
    }

    public void drawTorso(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(this.getX1(), this.getY1() + 20, 20, 25);
        g.setColor(torsoColor);
        g.fillRect(this.getX1() +1, this.getY1() + 21, 18, 23);
        g.setColor(Color.black);
    }

    public void drawLegs(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(this.getX1(), this.getY1() + 44, 20, 25);
        g.setColor(legColor);
        g.fillRect(this.getX1() +1, this.getY1() + 45, 18, 23);
        g.setColor(Color.black);
        g.drawLine(this.getX1() +9, this.getY1() +52, this.getX1() +9, this.getY1() +68);
    }

    public void drawRussian(Graphics g) {
        this.drawLegs(g);
        this.drawTorso(g);
        this.drawFace(g);
    }
}
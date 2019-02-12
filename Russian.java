import java.awt.*;

public class Russian {
    private int age;
    private String firstName;
    private String lastName;
    private String gender;
    private Color skinColor;
    private Color torsoColor;
    private Color legColor;
    private Color hairColor;
    private int x1;
    private int y1;

    public Russian(int a, String fn, String ln, String gen, Graphics g, Color sc, Color tc, Color lc, Color hc, int x1, int y1) {
        this.age = a;
        this.firstName = fn;
        this.lastName = ln;
        this.gender = gen;
        this.skinColor = sc;
        this.torsoColor = tc;
        this.legColor = lc;
        this.hairColor = hc;
        this.x1 = x1;
        this.y1 = y1;
    }

    public int getAge() { return age; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }
    public Color getSkinColor() { return skinColor; }
    public Color getTorsoColor() { return torsoColor; }
    public Color getLegColor() { return legColor; }
    public Color getHairColor() { return hairColor; }
    public int getX1() { return x1; }
    public int getY1() { return y1; }

    public void setAge(int age) { this.age = age; }
    public void setFirstName(String name) { this.firstName = name; }
    public void setLastName(String name) { this.lastName = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setSkinColor(Color skinColor) { this.skinColor = skinColor; }
    public void setTorsoColor(Color torsoColor) { this.torsoColor = torsoColor; }
    public void setLegColor(Color legColor) { this.legColor = legColor; }
    public void setHairColor(Color hairColor) { this.hairColor = hairColor; }
    public void setX1(int x1) { this.x1 = x1; }
    public void setY1(int y1) { this.y1	= y1; }

    public String greeting() {
        return "Hello Comrade, my name is " + getFirstName() + " " + getLastName() + ". I am a " + getGender() + " and am "
                + Integer.toString(getAge()) + " years old. My current coordinates are (" + Integer.toString(getX1()) + ", "
                + Integer.toString(getY1()) + ").";
    }

    public void drawFace(Graphics2D g) {
        g.setColor(getSkinColor());
        Polygon face = new Polygon();
        face.addPoint(this.getX1() - 1, this.getY1() + 5);
        face.addPoint(this.getX1() + 9, this.getY1());
        face.addPoint(this.getX1() + 20, this.getY1() + 5);
        face.addPoint(this.getX1() + 18, this.getY1() + 20);
        face.addPoint(this.getX1() + 9, this.getY1() + 25);
        face.addPoint(this.getX1() + 1, this.getY1() + 20);
        g.fillPolygon(face);
        g.setColor(Color.black);
        g.drawPolygon(face);
        g.setColor(Color.white);
        g.fillOval(this.getX1() + 2, this.getY1() + 8, 6, 4);
        g.fillOval(this.getX1() + 11, this.getY1() + 8, 6, 4);
        g.setColor(Color.black);
        g.drawOval(this.getX1() + 2, this.getY1() + 8, 6, 4);
        g.drawOval(this.getX1() + 11, this.getY1() + 8, 6, 4);
        g.setColor(Color.blue);
        g.fillRect(this.getX1() + 4, this.getY1() + 9, 2, 2);
        g.fillRect(this.getX1() + 13, this.getY1() + 9, 2, 2);
        g.setColor(Color.black);
        g.drawLine(this.getX1() + 6, this.getY1() + 19, this.getX1() + 13, this.getY1() + 19);
        g.drawLine(this.getX1() + 9, this.getY1() + 13, this.getX1() + 8, this.getY1() + 17);
        g.drawLine(this.getX1() + 8, this.getY1() + 17, this.getX1() + 10, this.getY1() + 17);
    }

    public void drawTorso(Graphics2D g) {
        g.setColor(torsoColor);
        Polygon arms = new Polygon();
        arms.addPoint(this.getX1() - 10, this.getY1() + 20);
        arms.addPoint(this.getX1() + 30, this.getY1() + 20);
        arms.addPoint(this.getX1() + 9, this.getY1() + 65);
        g.fillPolygon(arms);
        g.setColor(Color.black);
        g.drawPolygon(arms);
        g.setColor(torsoColor);
        g.fillRect(this.getX1(), this.getY1() + 20, 20, 25);
        g.setColor(Color.black);
        g.drawRect(this.getX1(), this.getY1() + 20, 20, 25);
    }

    public void drawLegs(Graphics2D g) {
        g.setColor(legColor);
        g.fillRect(this.getX1(), this.getY1() + 44, 20, 25);
        g.setColor(Color.black);
        g.drawRect(this.getX1(), this.getY1() + 44, 20, 25);
        g.drawLine(this.getX1() + 9, this.getY1() + 52, this.getX1() + 9, this.getY1() + 68);
    }

    public void drawHair(Graphics2D g) {
        if (getGender().equals("Female")) {
            g.setColor(hairColor);
            Polygon hair = new Polygon();
            hair.addPoint(this.getX1() + 20, this.getY1() + 5);
            hair.addPoint(this.getX1() + 10, this.getY1() + 7);
            hair.addPoint(this.getX1(), this.getY1() + 5);
            hair.addPoint(this.getX1() - 3 , this.getY1());
            hair.addPoint(this.getX1() + 3, this.getY1() + 1);
            hair.addPoint(this.getX1(), this.getY1() - 2);
            hair.addPoint(this.getX1() + 5, this.getY1() - 1);
            hair.addPoint(this.getX1() + 3, this.getY1() - 4);
            hair.addPoint(this.getX1() + 9, this.getY1() );
            hair.addPoint(this.getX1() + 7, this.getY1() - 5);
            g.fillPolygon(hair);
            g.setColor(Color.black);
            g.drawPolygon(hair);
        }
        else {

        }
    }

    public void drawShoes(Graphics2D g) {
        g.setColor(Color.black);
        Polygon ls = new Polygon();
        ls.addPoint(this.getX1() + 9, this.getY1() + 68);
        ls.addPoint(this.getX1() + 1, this.getY1() + 68);
        ls.addPoint(this.getX1() + 1, this.getY1() + 72);
        ls.addPoint(this.getX1() - 2, this.getY1() + 73);
        ls.addPoint(this.getX1() - 4, this.getY1() + 75);
        ls.addPoint(this.getX1() - 5, this.getY1() + 78);
        ls.addPoint(this.getX1() + 9, this.getY1() + 78);
        Polygon rs = new Polygon();
        rs.addPoint(this.getX1() + 18, this.getY1() + 68);
        rs.addPoint(this.getX1() + 10, this.getY1() + 68);
        rs.addPoint(this.getX1() + 10, this.getY1() + 72);
        rs.addPoint(this.getX1() + 7, this.getY1() + 73);
        rs.addPoint(this.getX1() + 5, this.getY1() + 75);
        rs.addPoint(this.getX1() + 5, this.getY1() + 78);
        rs.addPoint(this.getX1() + 18, this.getY1() + 78);
        g.fillPolygon(ls);
        g.setColor(Color.darkGray);
        g.drawPolygon(ls);
        g.setColor(Color.black);
        g.fillPolygon(rs);
        g.setColor(Color.darkGray);
        g.drawPolygon(rs);
        g.setColor(Color.black);
    }

    public void drawRussian(Graphics2D g) {
        this.drawTorso(g);
        this.drawShoes(g);
        this.drawLegs(g);
        this.drawFace(g);
        this.drawHair(g);
    }
}
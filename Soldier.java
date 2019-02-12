import java.awt.*;

/*
	This is the Soldier class. It inherits from the Russian class which is like a
	civilian, just that it is called Russian instead. Below will be any information
	that might be necessary to the Soldier class.
------------------------------------------------------------------------------------
	Camo Color possibility: (59, 119, 58)
	Rank options: Make an array of ranks and randomly pick a rank and assign it to
				 	that soldier.
	ANY NEW IDEAS PLEASE STATE BELOW THIS LINE
------------------------------------------------------------------------------------
------------------------------------------------------------------------------------
			Last update: 02/08/2019
*/

public class Soldier extends Russian {
    private String rank;
    private String branchOfService;
    private int yearsServed;
    private Color uniformColor;

    public Soldier(int a, String fn, String ln, String gen, Graphics g, Color sc, Color uc, Color hc, int x1, int y1, String r, String b, int y) {
        super(a, fn, ln, gen, g, sc, uc, uc, hc, x1, y1);
        this.uniformColor = uc;
        this.rank = r;
        this.branchOfService = b;
        this.yearsServed = y;
    }

    public String getRank()  {return rank; }
    public String getBranchOfService() { return branchOfService; }
    public int getYearsServed() { return yearsServed; }
    public Color getUniformColor() { return uniformColor; }

    public void setRank(String rank) { this.rank = rank; }
    public void setBranchOfService(String branchOfService) { this.branchOfService = branchOfService; }
    public void setYearsServed(int yearsServed) { this.yearsServed = yearsServed; }
    public void setUniformColor(Color uniformColor) { this.uniformColor = uniformColor; }

    public String greeting() {
        return super.greeting() + " I am a " + getRank() + " in the " + getBranchOfService() + " and I've served for " + Integer.toString(getYearsServed()) + " years.";
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
        g.setColor(uniformColor);
        Polygon hat = new Polygon();
        hat.addPoint(getX1() - 3, getY1() - 2);
        hat.addPoint(getX1() + 22, getY1() + 2);
        hat.addPoint(getX1() + 22, getY1() + 4);
        hat.addPoint(getX1() - 1, getY1() + 3);
        g.fillPolygon(hat);
        g.setColor(Color.black);
        g.drawPolygon(hat);
    }

    public void drawHair(Graphics2D g) {
    	g.setColor(getHairColor());
        Polygon hair = new Polygon();
        if (getGender().equals("Male")) {
        	hair.addPoint(this.getX1() + 20, this.getY1() + 5);
            hair.addPoint(this.getX1() + 10, this.getY1() + 7);
            hair.addPoint(this.getX1(), this.getY1() + 5);
            hair.addPoint(this.getX1() + 9, this.getY1());
            g.fillPolygon(hair);
            g.setColor(Color.black);
            g.drawPolygon(hair);
        }
        else {
        	
        }
    }
}
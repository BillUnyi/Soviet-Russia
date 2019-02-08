import java.awt.*;

public class General extends Soldier {
	private int numOfTroops;
	private Color officerColor;
	
	public General(int a, String n, String gen, Graphics g, Color c, int x1, int y1, String r, String b, int y, int numOfT) {
		super(a, n, gen, g, c, x1, y1, r, b, y);
		this.numOfTroops = numOfT;
		this.officerColor = new Color(245, 245, 220);
	}

	public int getNumOfTroops() { return numOfTroops; }
	public Color getOfficerColor() { return officerColor; }

	public void setNumOfTroops(int numOfTroops) { this.numOfTroops = numOfTroops; }
	public void setOffierColor(Color officerColor) { this.officerColor = officerColor; }

	public void greeting() {
		super.greeting(this.getRank(), this.getBranchOfService(), this.getYearsServed());
	}
	
	public void drawRussian(Graphics g) {
		super.drawRussian(g, this.officerColor);
	}
}
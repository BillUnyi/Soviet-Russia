import java.awt.*;

public class General extends Soldier {
	private int numOfTroops;
	
	public General(int a, String n, String gen, Graphics g, int x1, int y1, String r, String b, int y, int numOfT) {
		super(a, n, gen, g, x1, y1, r, b, y);
		this.numOfTroops = numOfT;
	}

	public int getNumOfTroops() { return numOfTroops; }

	public void setNumOfTroops(int numOfTroops) { this.numOfTroops = numOfTroops; }

	public void greeting() {
		super.greeting(this.getRank(), this.getBranchOfService(), this.getYearsServed());
	}
	
	public void drawGeneral(Graphics g) {
		super.drawSoldier(g, this.getX1(), this.getY1());
	}
}

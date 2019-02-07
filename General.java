import java.awt.*;

public class General extends Soldier {
	private int numOfTroops;
	
	public General(int a, String n, String gen, Graphics g, Color c, int x1, int y1, String r, String b, int y, int numOfT) {
		super(a, n, gen, g, c, x1, y1, r, b, y);
		this.numOfTroops = numOfT;
	}

	public int getNumOfTroops() { return numOfTroops; }

	public void setNumOfTroops(int numOfTroops) { this.numOfTroops = numOfTroops; }

	public void greeting() {
		super.greeting(this.getRank(), this.getBranchOfService(), this.getYearsServed());
	}
	
	public void drawRussian(Graphics g) {
		super.drawRussian(g);
	}
}
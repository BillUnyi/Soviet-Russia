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

	public Soldier(int a, String n, String gen, Graphics g, Color c, int x1, int y1, String r, String b, int y) {
		super(a, n, gen, g, c, x1, y1);
		this.uniformColor = new Color(59, 119, 58);
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
	
	public void greeting(String rank, String branchOfService, int yearsServed) {
		super.greeting();
		System.out.println(rank + " is my rank, i have served " + yearsServed + " years in the " + branchOfService);
		System.out.println();
	}
	
	public void drawRussian(Graphics g) {
		super.drawRussian(g, this.uniformColor);		
		
	}
}

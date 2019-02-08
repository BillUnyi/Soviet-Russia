import java.awt.*;

public class Soldier extends Russian {
    private String rank;
    private String branchOfService;
    private int yearsServed;

    public Soldier(int a, String n, String gen, Graphics2D g, Color c, int x1, int y1, String r, String b, int y) {
        super(a, n, gen, g, c, x1, y1);
        this.rank = r;
        this.branchOfService = b;
        this.yearsServed = y;
    }

    public String getRank()  {return rank; }
    public String getBranchOfService() { return branchOfService; }
    public int getYearsServed() { return yearsServed; }

    public void setRank(String rank) { this.rank = rank; }
    public void setBranchOfService(String branchOfService) { this.branchOfService = branchOfService; }
    public void setYearsServed(int yearsServed) { this.yearsServed = yearsServed; }

    public void greeting(String rank, String branchOfService, int yearsServed) {
        super.greeting();
        System.out.println(rank + " is my rank, i have served " + yearsServed + " years in the " + branchOfService);
        System.out.println();
    }

    public void drawRussian(Graphics g) {
        super.drawRussian(g);
    }

}
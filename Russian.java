import java.awt.*;

public class Russian {
	private int age;
	private String name;
	private String gender;
	private int x1;
	private int y1;
	
	public Russian(int a, String n, String gen, Graphics g, int x1, int y1) {
		this.age = a;
		this.name = n;
		this.gender = gen;
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getAge() { return age; }
	public String getName() { return name; }
	public String getGender() { return gender; }
	public int getX1() { return x1; }
	public int getY1() { return y1; }
	public String getRank()  { return ""; }
	public String getBranchOfService() { return ""; }
	public int getYearsServed() { return 0; }
	public int getNumOfTroops() { return 0; }
	
	public void setAge(int age) { this.age = age; }
	public void setName(String name) { this.name = name; }
	public void setGender(String gender) { this.gender = gender; }
	public void setX1(int x1) { this.x1 = x1; }
	public void setY1(int y1) { this.y1	= y1; }
	public void setRank(String rank) {}
	public void setBranchOfService(String branchOfService) {}
	public void setYearsServed(int yearsServed) {}
	public void setNumOfTroops(int numOfTroops) {}
	
	public void greeting() {
		System.out.println("Hello Comrade, my name is " + this.name + ". i am a " + this.gender + ". I am " + this.age + " years old.\n");
	}
	
	public void drawRussian(Graphics g) {
		
		g.fillOval(this.getX1(), this.getY1(), 20, 20);
		
		g.fillRect(this.getX1(), this.getY1() + 20, 20, 25);
		g.fillRect(this.getX1(), this.getY1() + 45, 20, 25);
	}
}
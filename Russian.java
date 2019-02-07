import java.awt.*;

public class Russian {
	private int age;
	private String name;
	private String gender;
	private Color color;
	private int x1;
	private int y1;
	
	public Russian(int a, String n, String gen, Graphics g, Color c, int x1, int y1) {
		this.age = a;
		this.name = n;
		this.gender = gen;
		this.color = c;
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getAge() { return age; }
	public String getName() { return name; }
	public String getGender() { return gender; }
	public Color getColor() { return color; }
	public int getX1() { return x1; }
	public int getY1() { return y1; }
	public String getRank()  { return ""; }
	public String getBranchOfService() { return ""; }
	public int getYearsServed() { return 0; }
	public int getNumOfTroops() { return 0; }
	
	public void setAge(int age) { this.age = age; }
	public void setName(String name) { this.name = name; }
	public void setGender(String gender) { this.gender = gender; }
	public void setColor(Color color) { this.color = color; }
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
		
		g.setColor(Color.black);
		//g.fillOval(this.getX1(), this.getY1(), 20, 20);
		Polygon faceOutline = new Polygon();
		faceOutline.addPoint(this.getX1() - 1, this.getY1() + 5);
		faceOutline.addPoint(this.getX1() + 9, this.getY1());
		faceOutline.addPoint(this.getX1() + 20, this.getY1() + 5);
		faceOutline.addPoint(this.getX1() + 18, this.getY1() + 20);
		faceOutline.addPoint(this.getX1() + 9, this.getY1() + 25);
		faceOutline.addPoint(this.getX1() + 1, this.getY1() + 20);
		g.fillPolygon(faceOutline);
		g.setColor(color);
		//g.fillOval(this.getX1() + 1, this.getY1() + 1, 18, 18);
		Polygon face = new Polygon();
		face.addPoint(this.getX1(), this.getY1() + 6);
		face.addPoint(this.getX1() + 9, this.getY1() + 1);
		face.addPoint(this.getX1() + 19, this.getY1() + 6);
		face.addPoint(this.getX1() + 17, this.getY1() + 19);
		face.addPoint(this.getX1() + 9, this.getY1() + 24);
		face.addPoint(this.getX1() + 2, this.getY1() + 19);
		g.fillPolygon(face);
		g.setColor(Color.black);
		//g.fillRect(this.getX1(), this.getY1() + 20, 20, 25);
		//g.fillRect(this.getX1(), this.getY1() + 45, 20, 25);
	}
}
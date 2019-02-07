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

	public void setAge(int age) { this.age = age; }
	public void setName(String name) { this.name = name; }
	public void setGender(String gender) { this.gender = gender; }
	public void setColor(Color color) { this.color = color; }
	public void setX1(int x1) { this.x1 = x1; }
	public void setY1(int y1) { this.y1	= y1; }
	
	public void greeting() {
		System.out.println("Hello Comrade, my name is " + this.name + ". i am a " + this.gender + ". I am " + this.age + " years old.\n");
	}
	
	public void drawRussian(Graphics g) {
		g.fillOval(this.getX1(), this.getY1(), 20, 20);
		
		g.setColor(new Color(234, 221, 157));
		g.fillOval(this.getX1() +1, this.getY1()+1, 18, 18);
		
		g.setColor(color.BLACK);
		g.fillRect(this.getX1(), this.getY1() + 20, 20, 25);
		
		g.setColor(color.WHITE);
		g.fillRect(this.getX1() +1, this.getY1() + 21, 18, 23);
		
		g.setColor(color.BLACK);
		g.fillRect(this.getX1(), this.getY1() + 44, 20, 25);
		
		g.setColor(color.green);
		g.fillRect(this.getX1() +1, this.getY1() + 45, 18, 23);
		
		g.setColor(color.black);
		g.drawLine(this.getX1() +9, this.getY1() +52, this.getX1() +9, this.getY1() +68);
	}
}

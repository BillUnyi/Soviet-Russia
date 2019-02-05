import java.awt.*;

public class Russian {
	private int age;
	private String name;
	private String gender;
	
	public Russian(int a, String n, String gen, Graphics g, int x1, int y1) {
		this.age = a;
		this.name = n;
		this.gender = gen;
		this.drawRussian(g, x1, y1);
		this.greeting();
	}

	public int getAge() { return age; }
	public String getName() { return name; }
	public String getGender() { return gender; }
	
	public void setAge(int age) { this.age = age; }
	public void setName(String name) { this.name = name; }
	public void setGender(String gender) { this.gender = gender; }
	
	public void greeting() {
		System.out.println("Hello Comrade, my name is " + this.name + ". i am a " + this.gender + ". I am " + this.age + " years old.\n");
	}
	
	public void drawRussian(Graphics g, int x1, int y1) {
		
		g.fillOval(x1, y1, 20, 20);
		
		g.fillRect(x1, y1 + 20, 20, 25);
		g.fillRect(x1, y1 + 45, 20, 25);
	}
}

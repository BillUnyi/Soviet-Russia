import java.awt.*;
import java.util.Random;

public class SovietUnion {
	
	private Russian russians[];
	
	public SovietUnion(int num) {
		
		this.russians = new Russian [num];
		Random random = new Random()
		for (int i = 0; i < num / 2; i++) {
			russians[num] = new Russian(random.nextInt(96) + 5, "Test", "Male");
		}
		for (int i = num / 2; i < num - 1; i++) {
			russians[num] = new Soldier(random.nextInt(33) + 18, "Test", "Male");
		}
		russians[num] = new General(random.nextInt(41) + 40, "Test", "Male");
	}
}

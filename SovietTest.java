import java.awt.*;
import java.applet.*;

public class SovietTest extends Applet {
	
	public void paint(Graphics g) {
		Russian r = new Russian(24, "TEst", "Male");
		
		r.drawRussian(g, 100, 100);
	}
	
}

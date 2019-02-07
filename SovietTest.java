import java.awt.*;
import java.applet.*;

public class SovietTest extends Applet {
	
	public void init() {
		super.setSize(1080, 720);
	}
	
	public void paint(Graphics g) {
		SovietUnion russia = new SovietUnion(100, g);
		russia.drawSovietUnion(g);
	}
	
}

package labTP;
import java.awt.Graphics;

import javax.swing.JPanel;
public class PanelPlain extends JPanel {
	private Bomber bomber;
	private Wheel wheel;
	public PanelPlain(Bomber bomber, Wheel wheel) {
		this.bomber = bomber;
		this.wheel = wheel;
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		bomber.DrawBomber(g);
		wheel.Draw(g);
	}
}

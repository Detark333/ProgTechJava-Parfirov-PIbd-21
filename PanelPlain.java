package labTP;
import java.awt.Graphics;

import javax.swing.JPanel;
public class PanelPlain extends JPanel {
	private ITransport plain;
	private IWheel wheel;
	public PanelPlain(ITransport plain, IWheel wheel) {
		this.plain = plain;
		this.wheel = wheel;
	}
	void setPlain(ITransport plain) {
		this.plain = plain;
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (plain != null) {
			plain.DrawPlain(g);
		}
	}
}

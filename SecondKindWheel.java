package labTP;
import java.awt.Color;
import java.awt.Graphics;
public class SecondKindWheel implements IWheel {
	private int _startPosX;
    private int _startPosY;
    private int _pictureWidth;
    private int _pictureHeight;
    private Color ColorWheel;
    public SecondKindWheel(Color colorwheel) {
    	ColorWheel = colorwheel;
    }
    public void SetPosition(int x, int y){
        _startPosX = x;
        _startPosY = y;
    }
    public void DrawWheel(Graphics g, int k) {
    	int x = 0;
		for (int i = 0; i < k; i++) {
			g.setColor(ColorWheel);
			g.fillOval(_startPosX + 35 + x, 70 + _startPosY, 23, 23);
			g.fillOval(_startPosX + 35 + x, 35 + _startPosY, 23, 23);
			g.setColor(Color.YELLOW);
			g.drawLine(_startPosX + 35 + x + 5, 35 + 5 + _startPosY, _startPosX + 30 + x + 23, 30 + _startPosY + 23);
			g.drawLine(_startPosX + 30 + x + 23, 35 + 5 + _startPosY, _startPosX + 35 + x + 5, 30 + _startPosY + 23);
			g.drawLine(_startPosX + 35 + x + 5, 35 + 35 + 5 + _startPosY, _startPosX + 30 + x + 23, 35 + 30 + _startPosY + 23);
			g.drawLine(_startPosX + 30 + x + 23, 35 + 35 + 5 + _startPosY, _startPosX + 35 + x + 5, 35 + 30 + _startPosY + 23);
			x += 20;
	    }

	}
	public void Draw(Graphics g, Wenum temp ) {
		int k = 0;
		switch (temp) 
		{
		case wheel2:
			k = 1;
			break;
		case wheel3:
			k = 2;
			break;
		case wheel4:
			k = 3;
			break;
		}
		DrawWheel(g, k);
	}
}

package labTP;

import java.awt.Color;
import java.awt.Graphics;

public class Wheel {
	private int _startPosX;
    private int _startPosY;
    private int _pictureWidth;
    private int _pictureHeight;
    private Color ColorWheel;
    private Wenum temp;
    public static boolean WLife;
    public Wheel(Color colorwheel, boolean life, Wenum t) {
    	ColorWheel = colorwheel;
    	WLife = life;
    	temp = t;
    }
    public void SetPosition(int x, int y, int width, int height){
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }
    public void DrawWheel(Graphics g, int k) {
    	if (WLife) {
	    	g.setColor(ColorWheel);
	    	int x = 0;
    		for (int i = 0; i < k; i++) {
    			g.fillOval(_startPosX + 35 + x, 70 + _startPosY, 23, 23);
    			g.fillOval(_startPosX + 35 + x, 35 + _startPosY, 23, 23);
    			x += 20;
    		}
    	}

    }
    public void Draw(Graphics g) {
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

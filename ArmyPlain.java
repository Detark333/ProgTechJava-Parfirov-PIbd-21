package labTP;
import java.awt.Color;
import java.awt.Graphics;
public class ArmyPlain extends Plain{
    public boolean Bombs;
    public boolean BackF;
    public boolean Tail;
    public int NumberBombs;
    public Color DopColor;
	public ArmyPlain(int numberBombs,int maxSpeed, int numberGuns, Color mainColor, Color dopColor, boolean bombs, boolean backF, boolean tail, float weight, IWheel wheel) 
    {	
		super(maxSpeed, numberGuns, mainColor, weight, wheel);
        NumberBombs = numberBombs;
        DopColor = dopColor;
        Bombs = bombs;
        BackF = backF;
        Tail = tail;
    }
	@Override
	 public void DrawPlain(Graphics g) {
		 super.DrawPlain(g);
		 if (Bombs)
	        {
	         g.setColor(Color.BLACK);
	         g.drawRect(_startPosX + 240, _startPosY + 20, 24, 12);
	         g.setColor(DopColor);
	         g.fillRect(_startPosX + 240, _startPosY + 20, 24, 12);
	         g.setColor(Color.BLACK);
	         g.drawOval(_startPosX + 240, _startPosY + 100, 20, 20);
	         g.setColor(DopColor);
	         g.fillOval(_startPosX + 240, _startPosY + 100, 20, 20);
	        }
	        if (BackF)
	        {
	            g.setColor(Color.BLACK);
	            g.drawRect(_startPosX + 100, _startPosY - 15, 50, 160);
	            g.setColor(DopColor);
	            g.fillRect(_startPosX + 100, _startPosY - 15, 50, 160);
	        }
	 }
}

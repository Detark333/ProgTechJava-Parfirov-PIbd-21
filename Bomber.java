package labTP;
import java.awt.Color;
import java.awt.Graphics;
public class Bomber {
	 static boolean Life;
	 private int plainWidth = 100;
	 private int plainHeight = 60;
     static int _startPosX;
     static int _startPosY;
     private int _pictureWidth;
     private int _pictureHeight;
     public int MaxSpeed;
     public float Weight;
     public Color MainColor;
     public int NumberBombs;
     public int NumberGuns;
     public Color DopColor;
     public boolean Bombs;
     public boolean BackF;
     public boolean Tail;
     public Bomber(boolean life, int numberBombs,int maxSpeed, int numberGuns, Color mainColor, Color dopColor, boolean bombs, boolean backF, boolean tail, float weight) 
     {	
    	 Life = life;
         NumberBombs = numberBombs;
         MaxSpeed = maxSpeed;
         NumberGuns = numberGuns;
         MainColor = mainColor;
         DopColor = dopColor;
         Bombs = bombs;
         BackF = backF;
         Tail = tail;
         Weight = weight;
     }
     public void SetPosition(int x, int y, int width, int height)
     {
         _startPosX = x;
         _startPosY = y;
         _pictureWidth = width;
         _pictureHeight = height;
     }
     public void MoveTransport(Penum direction)
     {
         float step = MaxSpeed * 100 / Weight;
         switch (direction)
         {
             case Right:
                 if (_startPosX + step < _pictureWidth - plainWidth - 180)
                 {
                     _startPosX += step;
                 }
                 break;
             case Left:
                 if (_startPosX - step > -10)
                 {
                     _startPosX -= step;
                 }
                 break;
             case Up:
                 if (_startPosY - step > 10)
                 {
                     _startPosY -= step;
                 }
                 break;
             case Down:
                 if (_startPosY + step < _pictureHeight - plainHeight - 130)
                 {
                     _startPosY += step;
                 }
                 break;
         }
     }
     public void DrawBomber(Graphics g)
     { 
    	 if(Life){
	         g.setColor(MainColor);
	         g.fillRect(_startPosX + 200, _startPosY - 15 + 10, 40, 140);
	         g.setColor(Color.BLACK);
	         g.drawRect(_startPosX, _startPosY + 35, 232 + 60, 55);
	         g.setColor(MainColor);
	         g.fillRect(_startPosX, _startPosY + 35, 232 + 60, 55);
	         if (Bombs)
	         {
	             DrawGuns(g);
	         }
	         if (BackF)
	         {
	             DrawBackF(g);
	         }
    	 }
     }
     public void DrawGuns(Graphics g)
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
     public void DrawBackF(Graphics g)
     {
         g.setColor(Color.BLACK);
         g.drawRect(_startPosX + 100, _startPosY - 15, 50, 160);
         g.setColor(DopColor);
         g.fillRect(_startPosX + 100, _startPosY - 15, 50, 160);
     }
            
}

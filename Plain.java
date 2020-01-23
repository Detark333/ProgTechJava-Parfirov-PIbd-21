package labTP;
import java.awt.Color;
import java.awt.Graphics;
public class Plain extends AbstractPlain {
	 private int plainWidth = 100;
	 private int plainHeight = 60;
	 private IWheel wheel;
	 public Plain(int maxSpeed, int numberGuns, Color mainColor, float weight, IWheel wheel) 
     {	
         MaxSpeed = maxSpeed;
         MainColor = mainColor;
         Weight = weight;
         this.wheel = wheel;
     }
	@Override
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
	 public int getPosX() {
			return _startPosX;
		}

	 public int getPosY() {
			return _startPosY;
	 }
	 public void DrawPlain(Graphics g)
     { 
		     wheel.SetPosition(getPosX(), getPosY());
	         g.setColor(MainColor);
	         g.fillRect(_startPosX + 200, _startPosY - 15 + 10, 40, 140);
	         g.setColor(Color.BLACK);
	         g.drawRect(_startPosX, _startPosY + 35, 232 + 60, 55);
	         g.setColor(MainColor);
	         g.fillRect(_startPosX, _startPosY + 35, 232 + 60, 55);
	         wheel.Draw(g, Wenum.wheel4);
     }
}

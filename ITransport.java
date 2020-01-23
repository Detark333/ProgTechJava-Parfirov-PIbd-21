package labTP;
import java.awt.Graphics;
public interface ITransport {
	void SetPosition(int x, int y, int width, int height);
	void MoveTransport(Penum direction);
    void DrawPlain(Graphics g);
    int getPosX();
    int getPosY();
}

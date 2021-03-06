package labTP;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class PlainDesinger {
	private JFrame frame;
	private JButton btnNewButtonRight;
	private JButton btnNewButtonDown;
	private JButton btnNewButtonLeft;
	private JButton btnNewButtonUp;
	private JButton btnCreate;
	private JPanel panelMain;
	private Bomber bomber = new Bomber(false, 250, 250, 2, Color.BLACK, Color.RED, true, true, true, 1500);
	private Wheel wheel = new Wheel(Color.BLUE, false, Wenum.wheel4);
 	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlainDesinger window = new PlainDesinger();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public PlainDesinger() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		panelMain = new PanelPlain(bomber, wheel);
		panelMain.setBounds(0, 0, 882, 603);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		btnCreate = new JButton("C������");
		btnCreate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Bomber.Life = true;
				Wheel.WLife = true;
				bomber.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				wheel.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
		}
			}
			);
		btnCreate.setBounds(12, 13, 102, 33);
		panelMain.add(btnCreate);
		btnNewButtonRight = new JButton(">");
		btnNewButtonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bomber.MoveTransport(Penum.Right);
				wheel.SetPosition(bomber._startPosX, bomber._startPosY, frame.getWidth(), frame.getHeight());
				
				panelMain.repaint();
			}
		});
		btnNewButtonRight.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonRight.setBounds(831, 551, 39, 39);
		panelMain.add(btnNewButtonRight);
		btnNewButtonDown = new JButton("v");
		btnNewButtonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bomber.MoveTransport(Penum.Down);
				wheel.SetPosition(bomber._startPosX, bomber._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonDown.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonDown.setBounds(780, 551, 39, 39);
		panelMain.add(btnNewButtonDown);
		btnNewButtonLeft = new JButton("<");
		btnNewButtonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bomber.MoveTransport(Penum.Left);
				wheel.SetPosition(bomber._startPosX, bomber._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonLeft.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonLeft.setBounds(729, 551, 39, 39);
		panelMain.add(btnNewButtonLeft);
		btnNewButtonUp = new JButton("^");
		btnNewButtonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bomber.MoveTransport(Penum.Up);
				wheel.SetPosition(bomber._startPosX, bomber._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonUp.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonUp.setBounds(780, 499, 39, 39);
		panelMain.add(btnNewButtonUp);
	}
}



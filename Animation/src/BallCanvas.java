import java.awt.*; 
import java.util.ArrayList; 
import javax.swing.JPanel; 


class BallCanvas extends JPanel{
	private ArrayList balls = new ArrayList(); //����һ�������б� 
	
	
	public void add(Ball b){ 
		balls.add(b); //���С�������б���
	} 
	
	
	public void paintComponent(Graphics g){ //��д����е�paintComponent()���� 
		super.paintComponent(g); 
		for (int i = 0; i < balls.size(); i++){ 
			Ball b = (Ball)balls.get(i); 
			b.draw(g); 
			}
		}
	
	
	}

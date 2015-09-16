import java.awt.*; 
import java.util.ArrayList; 
import javax.swing.JPanel; 


class BallCanvas extends JPanel{
	private ArrayList balls = new ArrayList(); //定义一个数组列表 
	
	
	public void add(Ball b){ 
		balls.add(b); //添加小球到数组列表中
	} 
	
	
	public void paintComponent(Graphics g){ //重写组件中的paintComponent()方法 
		super.paintComponent(g); 
		for (int i = 0; i < balls.size(); i++){ 
			Ball b = (Ball)balls.get(i); 
			b.draw(g); 
			}
		}
	
	
	}

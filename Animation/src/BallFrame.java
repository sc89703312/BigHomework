import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 



class BounceFrame extends JFrame {
	
	
	private BallCanvas canvas; //定义小球所在的面板变量
	public static final int WIDTH = 300; 
	public static final int HEIGHT = 200; 
	
	
	private Color[] colors = { Color.blue, Color.magenta, Color.orange, Color.red, Color.yellow, Color.pink }; //可选取的颜色
	private int counter; //产生小球个数计数器
	
	
	
	
	public BounceFrame() { //窗体构造函数
		setSize(WIDTH, HEIGHT); //设置窗体宽度高度
		setTitle("BounceThread"); //设置窗体的标题
		Container contentPane = getContentPane(); //获取窗体内容面板
		
		
		canvas = new BallCanvas(); //创建小球所在的面板对象
		
		
		//将小球所在的面板对象添加到窗体的内容面板中 
		contentPane.add(canvas, BorderLayout.CENTER); 
		
		
		JPanel buttonPanel = new JPanel();	

		
		
		JButton btnStart=new JButton("Start"); 
		JButton btnClose=new JButton("Close"); 
		
		
		buttonPanel.add(btnStart);
		buttonPanel.add(btnClose); 
		
		btnStart.addActionListener(new MyActionListener()); 

		btnClose.addActionListener(new MyActionListener()); 
		
		
		contentPane.add(buttonPanel, BorderLayout.SOUTH);//将面板添加到内容面板的下方 
		} 
	
	
	public void addBall() { //新建一个指定绘制面板和颜色的小球 
		Ball b = new Ball(canvas, colors[counter%colors.length]); 
		canvas.add(b); //在面板中添加新建的小球 
		BallThread thread = new BallThread(b); 
		thread.start(); //启动新建的线程
		} 
	
	
	
	class MyActionListener implements ActionListener{ //自定义一个监听器类
		public void actionPerformed(ActionEvent e){ //实现actionPerformed()方法
			if(e.getActionCommand()=="Start"){ //假如点击的是"Start"按钮 
				counter++; //小球计数器加1 
				addBall(); //调用添加小球，启动线程的方法 
				}
			else if(e.getActionCommand()=="Close"){ //假如点击的是"Close"按钮 
				System.exit(0); //结束程序
				} 
			} 
		} 
	
	
	
	public static void main(String[] args){ 
		JFrame frame = new BounceFrame(); 
	//新建一个窗体对象
		frame.setVisible(true); //显示窗体 } }
			}


	}


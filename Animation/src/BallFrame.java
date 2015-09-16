import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 



class BounceFrame extends JFrame {
	
	
	private BallCanvas canvas; //����С�����ڵ�������
	public static final int WIDTH = 300; 
	public static final int HEIGHT = 200; 
	
	
	private Color[] colors = { Color.blue, Color.magenta, Color.orange, Color.red, Color.yellow, Color.pink }; //��ѡȡ����ɫ
	private int counter; //����С�����������
	
	
	
	
	public BounceFrame() { //���幹�캯��
		setSize(WIDTH, HEIGHT); //���ô����ȸ߶�
		setTitle("BounceThread"); //���ô���ı���
		Container contentPane = getContentPane(); //��ȡ�����������
		
		
		canvas = new BallCanvas(); //����С�����ڵ�������
		
		
		//��С�����ڵ���������ӵ��������������� 
		contentPane.add(canvas, BorderLayout.CENTER); 
		
		
		JPanel buttonPanel = new JPanel();	

		
		
		JButton btnStart=new JButton("Start"); 
		JButton btnClose=new JButton("Close"); 
		
		
		buttonPanel.add(btnStart);
		buttonPanel.add(btnClose); 
		
		btnStart.addActionListener(new MyActionListener()); 

		btnClose.addActionListener(new MyActionListener()); 
		
		
		contentPane.add(buttonPanel, BorderLayout.SOUTH);//�������ӵ����������·� 
		} 
	
	
	public void addBall() { //�½�һ��ָ������������ɫ��С�� 
		Ball b = new Ball(canvas, colors[counter%colors.length]); 
		canvas.add(b); //�����������½���С�� 
		BallThread thread = new BallThread(b); 
		thread.start(); //�����½����߳�
		} 
	
	
	
	class MyActionListener implements ActionListener{ //�Զ���һ����������
		public void actionPerformed(ActionEvent e){ //ʵ��actionPerformed()����
			if(e.getActionCommand()=="Start"){ //����������"Start"��ť 
				counter++; //С���������1 
				addBall(); //�������С�������̵߳ķ��� 
				}
			else if(e.getActionCommand()=="Close"){ //����������"Close"��ť 
				System.exit(0); //��������
				} 
			} 
		} 
	
	
	
	public static void main(String[] args){ 
		JFrame frame = new BounceFrame(); 
	//�½�һ���������
		frame.setVisible(true); //��ʾ���� } }
			}


	}


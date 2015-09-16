import java.awt.*; 
class Ball {
	private Component canvas; //��С������ 
	private Color color; //С�����ɫ
    private static final int XSIZE = 30; //С��Ŀ��
	private static final int YSIZE = 30; //С��ĸ߶�
//	private int x = 0; //С�����ʼ����x 
	private int y = 0; //С�����ʼ����y
	private int dx = 1; //С��x �������� 
	private int dy = 1; //С��y ��������
	public Ball(Component c) { //���캯��������һ��Ĭ����ɫ��С�� 
		canvas = c;
		} 
	public Ball(Component c, Color color) { //���캯��������һ��color ��ɫ��С��
		canvas = c;
		this.color = color; 
		} 
	
	
	public void draw(Graphics g) { //��һ�����Բ��С�򣩷���
		if (color != null) 
			g.setColor(color); //��color ��Ϊ�գ�������
		 g.fillOval(x,y,XSIZE,YSIZE); //��һ�����Բ��С��
		 } 
	
	
	public void move() { 
		x += dx; //����x,y �ֱ���ԭ���Ļ����ϼ�һ������ 
	    y += dy;
	    if (x < 0) { //����С����������Ļ����߽磬��Ҫ�󷴵� 
		x = 0; dx = -dx; 
		} 
	if (x + XSIZE >= canvas.getWidth()) { //����С����������Ļ���ұ߽磬��Ҫ�󷴵�
		x = canvas.getWidth() - XSIZE; 
		dx = -dx; 
		} 
	if (y < 0) { //����С����������Ļ���ϱ߽磬��Ҫ�󷴵�
		y = 0; 
		dy = -dy; 
		
	} 
	
	if (y + YSIZE >= canvas.getHeight()) { //����С����������Ļ���±߽磬��Ҫ�󷴵� 
		y = canvas.getHeight() - YSIZE; 
		dy = -dy;
		} 
	
	
	
	
	canvas.repaint(); //�ػ���� 
	
	
	}
	}

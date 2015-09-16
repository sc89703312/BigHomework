import java.awt.*; 
class Ball {
	private Component canvas; //画小球的面板 
	private Color color; //小球的颜色
    private static final int XSIZE = 30; //小球的宽度
	private static final int YSIZE = 30; //小球的高度
//	private int x = 0; //小球的起始坐标x 
	private int y = 0; //小球的起始坐标y
	private int dx = 1; //小球x 坐标增量 
	private int dy = 1; //小球y 坐标增量
	public Ball(Component c) { //构造函数，构建一个默认颜色的小球 
		canvas = c;
		} 
	public Ball(Component c, Color color) { //构造函数，构建一个color 颜色的小球
		canvas = c;
		this.color = color; 
		} 
	
	
	public void draw(Graphics g) { //画一个填充圆（小球）方法
		if (color != null) 
			g.setColor(color); //若color 不为空，则设置
		 g.fillOval(x,y,XSIZE,YSIZE); //画一个填充圆（小球）
		 } 
	
	
	public void move() { 
		x += dx; //坐标x,y 分别在原来的基础上加一个增量 
	    y += dy;
	    if (x < 0) { //假如小球已碰到屏幕的左边界，则要求反弹 
		x = 0; dx = -dx; 
		} 
	if (x + XSIZE >= canvas.getWidth()) { //假如小球已碰到屏幕的右边界，则要求反弹
		x = canvas.getWidth() - XSIZE; 
		dx = -dx; 
		} 
	if (y < 0) { //假如小球已碰到屏幕的上边界，则要求反弹
		y = 0; 
		dy = -dy; 
		
	} 
	
	if (y + YSIZE >= canvas.getHeight()) { //假如小球已碰到屏幕的下边界，则要求反弹 
		y = canvas.getHeight() - YSIZE; 
		dy = -dy;
		} 
	
	
	
	
	canvas.repaint(); //重画面板 
	
	
	}
	}

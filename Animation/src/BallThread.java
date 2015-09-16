class BallThread extends Thread{
	
	
	private Ball b; 
	
	
	public BallThread(Ball aBall) { 
		//构造函数，构建一个线程 
		b = aBall; 
		} 
	
	
	
	public void run(){ 
		try{
			while(true){ 
				//循环处理，每隔5 毫秒前进一步 
				b.move();
				sleep(5);
				} 
			}catch (InterruptedException exception){}
		} 






	}


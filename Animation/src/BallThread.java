class BallThread extends Thread{
	
	
	private Ball b; 
	
	
	public BallThread(Ball aBall) { 
		//���캯��������һ���߳� 
		b = aBall; 
		} 
	
	
	
	public void run(){ 
		try{
			while(true){ 
				//ѭ������ÿ��5 ����ǰ��һ�� 
				b.move();
				sleep(5);
				} 
			}catch (InterruptedException exception){}
		} 






	}


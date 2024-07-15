class Thread1 implements Runnable{
	public void run(){
	  while(true){
		System.out.println("Good morning");
		try{
			Thread. sleep(1000);
		   }catch(Exception e){
		   	
        }
	  }
	}
}
class Thread2 implements Runnable{
	public void run(){
	while(true){
		System.out.println("Good afternoon");
		try{
		Thread.sleep(3000);
	}catch(Exception e){
		
	}
	}
	}
}
class Lab_9_Ajava{
	public static void main(String[] args) {
	    Thread1 th1=new Thread1();
	    Thread2 th2=new Thread2();
	    Thread t1 = new Thread(th1);
	    t1.start();
	    Thread t2 = new Thread(th2);
	    t2.start();
	}
}
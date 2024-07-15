class Lab_9_A2{
	public static void main(String[] args) {
		Thread tr1=new Thread();
		Thread tr2=new Thread();
		for (int i=0;i<=20 ;i++ ){
			if(i/2==0){
			System.out.println(i);
			try{
			Thread.sleep(1000);
				}catch(Exception e){

		  }
		}
		}
		for (int i=1 ;i<=20 ;i++ ){
			if(i/2!=0){
			System.out.println(i);
		try{
			Thread.sleep(1000);
			}catch(Exception e){

		}
	}
		}
	}
}
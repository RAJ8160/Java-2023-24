import java.util.Scanner;
class Thread1 extends Thread{
	public void run(){
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of Row :");
		int r=sc.nextInt();
		System.out.println("Enter a number of Collumn :");
		int c=sc.nextInt();
        int[][] a=new int[r][c];
    for (int i=0;i<r;i++ ) {
			for (int j=0;j<c;j++ ){
		try{		
			System.out.println("Enter a number of a["+i+"]["+j+"] :");
			a[i][j]=sc.nextInt();	
			sleep(1000);
		}catch(Exception e){

		}	
			}

		}
   }
}
class Thread2 extends Thread{
	public void run(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of Row :");
		int r=sc.nextInt();
		System.out.println("Enter a number of Collumn :");
		int c=sc.nextInt();
		int sum=0;
		int[][] a=new int[r][c];
        for (int i=0;i<r ;i++ ) {
        	for (int j=0;j<c ;j++ ){
        		try{
        		sum=sum+a[r][c];
        		sleep(3000);
        	}catch(Exception e){

        	}
        	}
        	System.out.println(sum);
        }
	}
}
class Lab_9_B{
	public static void main(String[] args) {
	
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		th1.start();
		th2.start();
	}
}
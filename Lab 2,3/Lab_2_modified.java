import java.util.Scanner;
class Lab_2_modified{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total Mark of paper :");
		int total=sc.nextInt();
		System.out.println("Enter total number of subject :");
		int n=sc.nextInt();
		int sum=0;
		double aver=1.0;
		for (int i=0;i<n ;i++ ) {
             System.out.println("Enter a mark of Subject " +i);
             int s=sc.nextInt();
             sum=sum+s;
		}
		aver=(sum*100)/(n*total);
	     System.out.println(" You get "+aver+" persentage");
	    if(aver>=60){
       	System.out.println("You get first division");
       }else if(aver<60 && aver>=50){
       	System.out.println("You get second devision");
       }else if(aver<50 && aver>=40){
       	System.out.println("You get Third devision");
       }else if(aver<40 && aver>=30){
       	System.out.println("You are pass devision");
       }else{
       	System.out.println("Sorry you are fail");
       }
	}
}
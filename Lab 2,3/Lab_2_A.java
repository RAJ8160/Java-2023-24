import java.util.Scanner;
class Lab_2_A{
	public static void main(String[] args) {
	   System.out.println("Enter a total mark in exam :");
       Scanner sc=new Scanner(System.in);
       double a=sc.nextDouble();
       System.out.println("Enter a mark of fist Subject :");
       double b=sc.nextDouble(); 
        System.out.println("Enter a mark of second Subject :");
       double c=sc.nextDouble(); 
        System.out.println("Enter a mark of third Subject :");
       double d=sc.nextDouble(); 
        System.out.println("Enter a mark of forth Subject :");
       double e=sc.nextDouble();
        System.out.println("Enter a mark of fifth Subject :");
       double f=sc.nextDouble();
       double sum=0.0;
       double aver=1.0;
       sum=(f+b+c+d+e);
       aver=sum/5;
       System.out.println("You get "+aver);
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
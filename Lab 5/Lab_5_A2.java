package B_tech_2nd_sem;
import java.util.Scanner;
class Time{
	int h;
	int m;
	int s;
	int d;
	Scanner sc=new Scanner(System.in);
	void sethour(int h){
          this.h=h;
	}
	void setminute(int m){
	     this.m=m;
	}
	void setsecond(int s){
          this.s=s;
	}
	int gethour(){
         System.out.println("Enter a hour :");
         int h=sc.nextInt();
         return h;
	}
	int getminute(){
	     System.out.println("Enter a minute :");
         int m=sc.nextInt();
         return m;
	}
	int getsecond(){
         System.out.println("Enter a second :");
         int s=sc.nextInt();
         return s;
	}
	public void sum(Time t1,Time t2){
		int sumh=0,summ=0,sums=0,sumd=0;
		     sumh=t1.h+t2.h;
			summ=t1.m+t2.m;
			sums=t1.s+t2.s;
		while(sums>60 || summ>60 || sumh>24){
			if(sumh>24){
				sumd++;
				sumh=sumh-24;
			}
			else if(summ>60){
				sumh++;
				summ=summ-60;
			}
			else if(sums>60){
				summ++;
				sums=sums-60;
			}
		}
		System.out.println(sumd+":"+sumh+":"+summ+":"+sums);
	}
}
class Lab_5_A2{
	public static void main(String[] args) {
	    Time t1=new Time();
	    t1.sethour(t1.gethour());
	    t1.setminute(t1.getminute());
	    t1.setsecond(t1.getsecond());
	    Time t2=new Time();
	    t2.sethour(t2.gethour());
	    t2.setminute(t2.getminute());
	    t2.setsecond(t2.getsecond());
	    Time t3=new Time();
	    t3.sum(t1,t2);
	}
}
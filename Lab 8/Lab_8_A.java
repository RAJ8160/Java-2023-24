import java.lang.*;
class Multipication{
	int x;
	int y;
	int mult=1;
	void mltiplication(int x,int y){
		for (int i=0;i<y ;i++ ) {
			mult=x*mult;
		}
  		System.out.println("The Power of "+x+" rasto "+y+" is : "+mult);
	}
}
public class Lab_8_A{
  public static void main(String[] args) {
  	try{
  	Integer a=Integer.parseInt(args[0]);
  	Integer b=Integer.parseInt(args[1]);
  	Multipication m1=new Multipication();
  	m1.mltiplication(a,b);
  	}catch(Exception e){
  		System.out.println("Please Enter Two Value in Commandline");
  	}
  	System.out.println("Code Run Successfully");
  }
}
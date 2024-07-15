package B_tech_2nd_sem;
import java.util.Scanner;
class Circle{
      double radious;
      Circle(){
      	radious=0;
      }
       double get_Radious(){
      	System.out.println("Enter radious :");
      	Scanner sc=new Scanner(System.in);
      	double r=sc.nextDouble();
      	return r;
      }
       void set_Radious(double r){
      	this.radious=r;
      }
       void area(double r){
      	double area;
      	area=3.14*r*r;
      	System.out.println("Area of Circle is "+area);
      }
}
class Lab_5_A1{
	public static void main(String[] args) {
		Circle c1=new Circle();
		double r=c1.get_Radious();
		c1.set_Radious(r);
		c1.area(r);
	}
}
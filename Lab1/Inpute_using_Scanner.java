package B_tech_2nd_sem;

import java.util.Scanner;
class Inpute_using_Scanner{
	public static void main(String[] args) {
		int sum=0;
		double a1,b1,sum1=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a:");
		int a=sc.nextInt();
		System.out.println("Enter number b:");
		int b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum is "+sum);
        System.out.println("Enter number a1 :");
        a1=sc.nextDouble();
        System.out.println("Enter number b1 :");
        b1=sc.nextDouble();
        sum1=a1+b1;
        System.out.println("Sum is "+sum1);

	}
}
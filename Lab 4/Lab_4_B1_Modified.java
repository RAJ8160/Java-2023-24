import java.util.Scanner;
class Lab_4_B1_Modified{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array :");
        int n=sc.nextInt();
        int sum=0,aver=1;
		int[] a=new int[n];
		for (int i=0;i<n ;i++ ){
			System.out.println("Enter an element of a["+i+"] : ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n ;i++ ){
			System.out.println("Enter an element of a["+i+"] :"+a[i]);
			sum=sum+a[i];
		}
		aver=sum/n;
		System.out.println("The average is :"+aver);
	}
}
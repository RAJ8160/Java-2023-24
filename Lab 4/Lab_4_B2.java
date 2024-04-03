import java.util.Scanner;
class Lab_4_B2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of Array :");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("Original Array is :");
		for (int i=0;i<n ;i++ ) {
			System.out.println("An element of a["+i+"] is :");
			a[i]=sc.nextInt();
		}
        
        for (int i=0;i<n/2;i++){
        	int temp;
        	temp=a[i];
        	a[i]=a[n-1-i];
            a[n-1-i]=temp;
        }
        System.out.println("The apdeted Array is");
        for (int i=0;i<n;i++){
        	System.out.println("An element  is :"+a[i]);
        }
	}
}
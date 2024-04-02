import java.util.Scanner;
class Lab_2_C{
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2,count=0;
		while( i<=n/2){
          if(n%i==0){
          	count++;
          }
          i++;
		}
		if(count==0){
			System.out.println("This Number is Prime");
		}else{
			System.out.println("This Number is not Prime");
		}
	}
}
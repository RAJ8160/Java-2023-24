import java.util.Scanner;
class Lab_2_B2{
	public static void main(String[] args) {
		System.out.println("Enter a number A :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter a second number B :");
		int b=sc.nextInt();
		System.out.println("Enter a Third  number C :");
		int c=sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("A is Largest number");
			}else{
				System.out.println("C is Largest number");
			}
		}else{
			if(b>c){
				System.out.println("B is Largest number");
			}else{
				System.out.println("C is Largest number");
			}
		}
	}
}
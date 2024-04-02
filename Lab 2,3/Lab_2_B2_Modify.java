import java.util.Scanner;
class Lab_2_B2_Modify{
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
				if(b>c){
					System.out.println("A>B>C");
				}else{
					System.out.println("A>C>A");
				}
			}else{
				if(a>c){
					System.out.println("B>A>C");
				}else{
					System.out.println("B>A>C");
				}
			}
		}else{
			if(b>c){
				if(a>c){
					System.out.println("B>A>C");
				}else{
					System.out.println("B>C>A");
				}
			}else{
				if(a>b){
					System.out.println("C>A>B");
				}else{
					System.out.println("C>B>A");
				}
			}
		}
	}
}
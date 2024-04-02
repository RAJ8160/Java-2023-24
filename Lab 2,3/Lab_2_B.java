import java.util.Scanner;
class Lab_2_B{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		/*int a=sc.nextInt();
		int b=0,rem=0;
		int c=a;
		for (int i=0;a!=0;i++){
			rem=a%10;
			b=b*10+rem;
			a=a/10;
		}
		System.out.println(b);
		if (c==b) {
			System.out.println("This number is palindrom");
		}
		else{
			System.out.println("This number is not palindrom");
		}*/
		String s=sc.nextLine();
		int r=s.length();
		for (int i=0;i<=r/2;i++){
			if(s.charAt(i)!=s.charAt(r-1-i)){
			   System.out.println("This String is not palindrom");
			   break;
			}else{
				if(i==r/2){
					System.out.println("This String is Palindrom");
					break;
				}
				continue;
			}
        }
	}
}
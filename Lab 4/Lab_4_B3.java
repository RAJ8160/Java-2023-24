import java.util.Scanner;
class Lab_4_B3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String a=sc.nextLine();
		int count=0;
		for (int i=0;i<a.length() ;i++){
			count++;
		}
		System.out.println("The Length of String is "+count);
		System.out.println("The substring is "+a.substring(2,5));
	}
}
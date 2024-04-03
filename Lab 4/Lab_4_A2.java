import java.util.Scanner;
class Lab_4_A2{
	public static void main(String[] args) {
		System.out.println("Enter an inpute :");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int Nov=0,Noc=0;
		for (int i=0;i<a.length() ;i++ ){
			if(a.charAt(i)=='A'||a.charAt(i)=='a'||a.charAt(i)=='E'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U'){
                Nov++;
			}else{
				Noc++;
			}
			
		}
		System.out.println(" Toatal number of vovel is "+Nov);
		System.out.println("Total number of consonal is "+Noc);
	}
}
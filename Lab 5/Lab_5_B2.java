import java.util.Scanner;
class imaginary{
	int real_part;
	int imaginary_part;
	void getInpite(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a real part :");
		this.real_part=sc.nextInt();
		System.out.println("Enter an imaginary part :");
		this.imaginary_part=sc.nextInt();
		System.out.println("the complex number is :"+real_part+"+"+imaginary_part+"i");
	}
	void sum(imaginary i1,imaginary i2){
         int sumrealpart=0;
         int sumimaginarypart=0;

         sumrealpart=i1.real_part+i2.real_part;
         sumimaginarypart=i1.imaginary_part+i2.imaginary_part;

         System.out.println(" the sum is : "+sumrealpart+"+"+sumimaginarypart+"i");
	}
}
class Lab_5_B2{
	public static void main(String[] args) {
		imaginary i1=new imaginary();
		i1.getInpite();
		imaginary i2=new imaginary();
		i2.getInpite();
		imaginary i3=new imaginary();
		i3.sum(i1,i2);
	}
}
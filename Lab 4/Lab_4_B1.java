import java.util.Scanner;
class Lab_4_B1{
	public static void main(String[] args) {
	int[] a={23,45,67,89};
	int sum=0,aver=1;
	for (int i=0;i<a.length;i++){
        System.out.println("The element of ["+i+"] is "+a[i]);
		sum=sum+a[i];
		}
    aver=sum/a.length;
    System.out.println("The average is "+aver);
	}
}
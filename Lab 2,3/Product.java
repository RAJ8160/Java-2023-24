import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.util.Scanner;

public class Product {
    public static void main(String arg[]){
        System.out.print("Enter num which you get product " );
        int a,b,mul;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        mul=a*b;
        System.out.print(mul);
    }
}

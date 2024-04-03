import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        float r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radious what you want");
        r=sc.nextFloat();
        float area;
        area=3.14f*r*r;
        System.out.println("The area of Circle is:"+area);
    }
}
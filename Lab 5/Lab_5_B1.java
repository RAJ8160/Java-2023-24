package B_tech_2nd_sem;
import java.util.Scanner;
import java.lang.*;
class CheckString{
	String a;
	
 void Cheking(String a){
 	int tnv=0,tnc=0;

 for (int i=0;i<a.length();i++ ) {
 	    
 	    if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='i'||a.charAt(i)=='I'||
 	    	a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U'){
 	    	tnv++;
 	    }
 	     else{
 	    	tnc++;
 	    }
 }
    System.out.println("Total number of vovel is "+tnv);
    System.out.println("Total number of consonal is "+tnc);
}
}
class Lab_5_B1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CheckString cs1=new CheckString();
       System.out.println("Enter a String ");
       System.out.println("When you want to and programe write quit or QUIT ");
        String r=" ";
        String a=" ";
        while(a!="quit"){
        	 r=r+a;
            a=sc.nextLine();
             if(a=="quit"){
             	break;
             }
           System.out.println(r);
        }
       	cs1.Cheking(cs1.a);
     }
}
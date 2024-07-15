import java.io.*;
import java.util.*;
class Lab_10_A1{
	public static void main(String[] args) {
	File f1=new File("abc.txt");
	int line=0,wors=0;
     try{
       if(f1.exists()){
       	throw new filenotFoundExeption("file not Found");
       }
       String str1="",str2="";
       Scanner sc=new Scanner(f1);
            
       while(sc.hasnextLine()){
       	str1+=sc.hasnextLine();
       	   line++;
       }
       sc.close();
       Scanner sc=new Scanner(str1);
        while(sc.hasnextLine()){
       	str2+=sc.hasnextLine();
       	   words++;
       }
       sc.close();
       System.out.println("Line:"+line);
        System.out.println("Words:"+words);
         System.out.println("Cahracter langth:"+f1.langth());

     }catch(Exception e){
     	System.out.println(e);
     }
     }
}
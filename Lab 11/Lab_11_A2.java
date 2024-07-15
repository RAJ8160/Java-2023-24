import java.io.*;
class Lab_11_A2{
	public static void main(String[] args) {
		String Name=args[0];
		try{
         File f1=new File(Name);
		
		if(f1.exists()){
			if(f1.isFile()){
				System.out.println(f1.length());
			}
			else if(f1.isDirectory()){
				File[] f2= f1.listFiles();
                for(File f3 : f2){
                	System.out.println(f3.getName());
                }
			}
		}
	}catch(Exception e){

	}
	}

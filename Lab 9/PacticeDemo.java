import java.util.*;
import java.io.*;
class ParacticeDemo{
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		mt1.start();
	}
}
class MyThread extends Thread{
	public void run(){
		Date d= new Date();
		try{
		while(true){
			if(d.getHoure()<12)
			System.out.println("Good Morning");
			Thread.sleep(1000*60*60);
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
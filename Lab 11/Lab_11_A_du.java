import java.io.*;	
class Lab_11_A_du{
	public static void main(String[] args) {
class Student{
	int inrollment_number;
	String name;
	Student(int inrollment_number,String name){
		this.inrollment_number=inrollment_number;
		this.name=name;
	}
}
class DemoStudent{
	public static void main(String[] args) {
		try{
	   BufferedWriter BW=new BufferedWriter(new FileWriter("Student.txt"));
          Student s1=new Student(23,"Ayush");
          BW.Write(23,"Ayush");
         System.out.println("File Write Succes fuuly");
         }catch(Exception e){
         	System.out.println(e);
         }
         try{
         	BufferedReader BR=new BufferedReader(new FileReader("Student.txt"));
         	String line = BR.readLine();

         	while(line!=null){
             String[] s=line.split(",");
             String Name=s[0];
             String Inrollment_number=s[1];
             System.out.println("Name :"+Name+" Inrollment number "+Inrollment_number);

             line = BR.readLine();
         }
             BR.close();   
         }catch(Exception e){
         	System.out.println(e);
         }

	}
}
	}
}
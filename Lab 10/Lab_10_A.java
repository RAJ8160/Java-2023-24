import java.io.*;
class Lab_10_A{
    public static void main(String[] args){
        File f1=new File("abc.txt");
        try{
            f1.creatnewfile();
        }catch(Exeption e){
            System.out.println(e);
        }
    }
}
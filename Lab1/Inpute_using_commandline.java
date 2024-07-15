package B_tech_2nd_sem;

class Sum{
    int a;
    int b;
    boolean c;
    boolean d;
    float e;
    float f;
    static void sum(int i,int j){
        int sum=0;
        sum=i+j;
        System.out.println("This sum is:"+sum);
    }
    static void sum(double i,double j){
        double sum=0.0;
        sum=i+j;
        System.out.println("This sum is:"+sum);
    }
    static void sum(float i,float j){
        float sum=0.0f;
        sum=i+j;
        System.out.println("This sum is:"+sum);
    }
}
public class Inpute_using_commandline {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println(args[0]);
        System.out.println(args[1]);
         double c=Double.parseDouble(args[2]);
        double d=Double.parseDouble(args[3]);
        float e=Float.parseFloat(args[4]);
        float f=Float.parseFloat(args[5]);
    //      sum(c,d);
     Sum s1= new Sum();
        s1.sum(a,b);
        s1.sum(c,d);
        s1.sum(e,f);
    //   float  i=sum(e,f);


    }
}

interface  A{
	public void show(int x,String y);
}
interface  B{
	public void run(int p);
}
class C implements A,B{
	public void show(int x,String y){
		System.out.println("Your name is"+y+"Your age is"+x);
	}
	public void run(int p){
		System.out.println("Your run time is "+p);
	}
}
class DEmob{
	public static void main(String[] args) {
		C c1=new C();
		c1.show(4,"raj");
		c1.run(7);
	}
}
interface Tranceport{
     abstract public void  deliver();
}
class Animal implements Tranceport{
	String name;
	boolean IsuseInTransport=false;
	public void deliver(){
		System.out.println("This is a animal");
		System.out.println("The name of animal is "+name);
		System.out.println("This use  in tranceport :"+IsuseInTransport);
	}
}
class Tiger extends Animal{
	String name="Tiger";
	boolean IsuseInTransport=false;
	public void deliver(){
		System.out.println("This is a Tiger");
		System.out.println("The name of animal is "+name);
		System.out.println("This use  in tranceport :"+IsuseInTransport);
	}
}
class Lion extends Animal{
	String name="lion";
	boolean IsuseInTransport=false;
	public void deliver(){
		System.out.println("This is a lion");
		System.out.println("The name of animal is "+name);
		System.out.println("This use  in tranceport :"+IsuseInTransport);
	}
}
class Donkey extends Animal{
	String name="Donkey";
	boolean IsuseInTransport=true;
	public void deliver(){
		System.out.println("This is a Donkey");
		System.out.println("The name of animal is "+name);
		System.out.println("This use  in tranceport :"+IsuseInTransport);
	}
}
class Camel extends Animal{
	String name="Camel";
	boolean IsuseInTransport=true;
	public void deliver(){
		System.out.println("This is a Camel");
		System.out.println("The name of animal is "+name);
		System.out.println("This use  in tranceport :"+IsuseInTransport);
	}
}
class Bullock extends Animal{
	String name="Bullock";
	boolean IsuseInTransport=true;
	public void deliver(){
		System.out.println("This is a Bullock");
		System.out.println("The name of animal is "+name);
		System.out.println("This use  in tranceport :"+IsuseInTransport);
	}
}
class DemoTransport{
	public static void main(String[] args) {
		Animal [] a =new Animal[5];
		a[0]=new Tiger();
		a[1]=new Lion();
		a[2]=new Bullock();
		a[3]=new Camel();
		a[4]=new Donkey();
		for (int i=0;i<5;i++ ) {
			a[i].deliver();
			System.out.println();
		}

	}
}
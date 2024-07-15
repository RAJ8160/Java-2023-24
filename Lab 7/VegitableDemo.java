 abstract class Vegetable{
	String colore;
	String name;
   abstract public String toString();
   Vegetable(){
   	  this.colore=colore;
   	  this.name=name;
   }
}
class potato extends Vegetable{
     potato(){
         super.name="potato";
         super.colore="brown";
     }
    public String toString(){
     	return "Vegetable name is"+super.name+"or it's colore is"+super.colore;
     }
}
class brinjal extends Vegetable{
       brinjal(){
          super.name="brinjal";
          super.colore="purple";
       }
      public String toString(){
     	return "Vegetable name is"+super.name+"or it's colore is"+super.colore;
     }
}
class tomato extends Vegetable{
       tomato(){
          super.colore="red";
          super.name="tomato";
       }
       public String toString(){
     	return "Vegetable name is"+super.name+"or it's colore is"+super.colore;
     }
}
class VegitableDemo{
	public static void main(String[] args) {
		potato p=new potato();
		tomato t=new tomato();
		brinjal b=new brinjal();

		System.out.println(p);
		System.out.println(b);
		System.out.println(t);
	}
}
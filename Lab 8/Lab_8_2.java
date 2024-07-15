class Lab_8_2{
	public static void main(String[] args) {
		
		System.out.println("Enter number What you want");
		int[] a=new int[args.length];
		int i=0;
		int sum=0;
        while(i<args.length){
	        try{
				a[i]=Integer.parseInt(args[i]);
				if(a[i]<0){
					throw new NegativenumbeExeption();
				}
				else if(a[i]>1000 && a[i]<2000){
	                throw new ConditionExeption();
				}
				else if(a[i]%10==0){
	                throw new NumberDevideBy10Exeption();
				}
				else if(a[i]>7000){
					throw new NumberGreterSevenThiusandExeption();
				}
				else{
	                 sum=sum+a[i];
				}				
			}catch(NegativenumbeExeption e){
				System.out.println("The tearm of "+args[i]+"is nagative");
			}catch(ConditionExeption e){
				System.out.println("The tearm of "+args[i]+"is Condition Exeption");
			}catch(NumberDevideBy10Exeption e){
				System.out.println("The tearm of "+args[i]+"is Number Devide By 10 Exeption");
			}catch(NumberGreterSevenThiusandExeption e){
				System.out.println("The tearm of "+args[i]+"is Number Greter Seven Thiusand Exeption");
			}
			i++;
		}

         System.out.println(sum);

	}
}

class NegativenumbeExeption extends Exception{
	NegativenumbeExeption(){
		super();
	}
}
class ConditionExeption extends Exception{
	ConditionExeption(){
		super();
	}
}
class NumberDevideBy10Exeption extends Exception{
	NumberDevideBy10Exeption(){
		super();
	}
}
class NumberGreterSevenThiusandExeption extends Exception{
	NumberGreterSevenThiusandExeption(){
		super();
	}
}
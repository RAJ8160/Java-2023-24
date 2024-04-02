class Get_inpute_by_usser{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int sum=0;
		sum=a+b+c;
		System.out.println("sum is "+sum);
		double d=Double.parseDouble(args[3]);
		double e=Double.parseDouble(args[4]);
        double f=Double.parseDouble(args[5]);
        double sum1=0.0;
        sum1=d+e+f;
        System.out.println("This sum is "+sum1);

	}
}
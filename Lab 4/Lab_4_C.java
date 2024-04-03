class Lab_4_C{
	public static void main(String[] args) {
		System.out.println("Pattern 1:");
		String a="Stream";
		for (int i=0;i<6 ;i++ ){
			for (int j=0;j<=i;j++ ) {
				System.out.print(a.charAt(j));
			}
			System.out.println(" ");
			
		}
		System.out.println(" ");

		System.out.println("Pattern 2:");
		for (int i=0;i<6 ;i++ ){
			for (int j=0;j<=i;j++ ) {
				System.out.print(a.charAt(j));
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		System.out.println("Pattern 3:");
		for (int i=0;i<=6 ;i++ ){
			if(i<=3){
			for (int j=0;j<=i;j++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}else{
			for (int j=i;j<=6;j++ ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		}
		System.out.println(" ");

		System.out.println("Pattern 4:");
		for (int i=6;i>0 ;i-- ){
			for (int j=6;i<=j;j-- ) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
package starter.financepart1;


public class Program {

	public static void main(String[] args) {
		
		Account ac1 , ac2 ;
		ac1 = new Account("Fred", 100);
		ac2 = new Account("Suzy", 200) ;
		
		System.out.println(ac1.getDetails() );
		System.out.println(ac2.getDetails());
		
		ac1.transfer(600, ac2) ;
		
		System.out.println(ac1.getDetails() );
		System.out.println(ac2.getDetails());
	
	
	}

}

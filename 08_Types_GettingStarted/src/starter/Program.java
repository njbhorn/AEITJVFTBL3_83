package starter;

class Program {
	
	private Account ac1, ac2;
	private static int num1, num2;

	
	public static void main(String[] args) {
		// Uncomment these calls as instructed in 
		// the exercise guide
		
		Program p = new Program () ;

		p.testRefType();
		p.testValueType();
//		
//		
//		
		p.testIntArray();
		p.testAccountArray();

	}

	

	private void displayBalances() {
		System.out.printf("\n'ac1' has: %.2f 'ac2' has: %.2f\n",
				ac1.getBalance(), ac2.getBalance());
	}

	private void testRefType() {
		ac1 = new Account(100.0, "John Smith");
		ac2 = ac1;
		displayBalances(); // 1st time

		ac2.deposit(100.0);
		displayBalances(); // 2nd time

		passAccountByValue(ac1);
		displayBalances(); // 3rd time

	}

	private  void passAccountByValue(Account ac) {
		ac.deposit(100.0);
	}

	
	
	
	
	
	private  void displayInts() {
		System.out.printf("\n'num1' is %d    'num2' is %d\n", num1, num2);
	}

	private  void testValueType() {
		num1 = 10;
		num2 = num1;
		displayInts(); // 1st time

		num2++;
		displayInts(); // 2nd time

		passIntByValue(num1);
		displayInts(); // 3rd time

	}

	private  void passIntByValue(int i) {
		i++;
	}

	
	// ***********
	
	private  void testIntArray() {
		int[] ages = { 13, 15, 17 };
		processAges(ages);
		System.out.println(ages[1]); // 15 or 25
	}

	private  void processAges(int[] ages) {
		ages[1] += 10;
	}

	private  void testAccountArray() {
		Account[] accs = { new Account(100.00, "Fred"),
				           new Account(200.00, "Jazz") };
		processAccounts(accs);
		System.out.println(accs[0].getHolder()); // Fred or Jazz?
	}

	private  void processAccounts(Account[] accs) {
		Account temp = accs[0];
		accs[0] = accs[1];
		accs[1] = temp;
	}
}

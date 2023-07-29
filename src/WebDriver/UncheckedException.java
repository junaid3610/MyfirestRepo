package WebDriver;

public class UncheckedException {
	public static void main(String[] args) {
//	System.out.println("Entered int the class");
//	System.out.println("Entered int the main method");
//	
	
	// unchecked Exception
  // Exaple 1 :- Arithmatic Exception
	 
//	int a =50;
//	try {
//		System.out.println(a/0);           // this is my false condition
//	}catch(Exception e) {
//		e.printStackTrace();
//		System.out.println("=====");
//	}
	
   // Example 2 :- Nullpointer Exception
	
//	String s = null;
//	try {
//		System.out.println(s.length());
//	}catch(Exception e) {
//		e.printStackTrace();
//		
//	}
	
  // Example 3 :- Numberformat Exception
//		String  a = "1583";
//		try {
//			int i =Integer.parseInt(a);
//			System.out.println(i);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}

	// Example 4 :- ArrayoutofBound exception
		 
		int a[] = new int[5];
		a[10] = 500;
		System.out.println("exit from the main method");
		System.out.println("Exit from the class");
		
		
		
		
	}
	
	
	

}

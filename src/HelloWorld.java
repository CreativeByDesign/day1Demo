import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		System.out.println("Hello");
		System.out.println("World");
		
		/*
		 * block comment / * returnΩ
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		
		int num = scan.nextInt();
		
		System.out.println(num);
		
		// garbage line -- cleans out the scanner to take in different type of input
		//necessary when going from numberic input to scan.nextLine ()
	    //scan.nextLine();
		
		System.out.println("Please enter your first and last name: ");
		String fullName = scan.next();
		System.out.println(fullName);
		scan.close(); // this should be the end of your scanner use
		
		// this is a constant and can not be changed
		final String TEST = "Grand circus";
		
		System.out.println(9 % 5); // show remainder
		
		String words = "this is a sentence";
		words += " and I added some words!";
		System.out.println(words);
		
		//implicit casting example
		int age = 21; 
		double myAge = age;
		System.out.println(age);
		
		//explicit casting
		
		double total = 258.54;
		int newTotal = (int)total;
		System.out.println(newTotal);
				

		
		
		
		
		
		
	}

}

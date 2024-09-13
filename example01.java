import java.util.Scanner; // importing the Scanner module from the java development environment.

// Global class and doubles as the name of the program to be refrenced within the java development environment.
public class example01{
	// main class of the program and acts as the entry point to the example01 global class, all tasks are performed within this class.
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); // creating a scanner object to help us read input from the user.
		
		System.out.print("\n\nEnter your name here: "); // this line prints/displays/outputs the text within the quotations i.e "Enter your name here:"
		String name = scanner.next(); // creating a "name" variable to hold any input string value from the user.
		
		System.out.println("\nHello there " + name + ", welcome to our Club!\n");
		scanner.nextLine();

		System.out.println("Enter your age here: ");
		int age = scanner.nextInt(); // creating the "age" variable to hold any integer age value input by the user. 

		System.out.println("You entered: "+age);
		System.out.println("Meaning you are " + age + " years old!\n");
                scanner.nextLine();
		
		// inserting and using some conditional statements i.e if, else if and else.

		if(age <= 18){
		System.out.println("You just a kid, for christsake, just go back home to mummy " + name + "!\n");
		}else if(age == 19 ){
		System.out.println(name + ", You are still a teenager, not yet of age to be allowed inside!\n");
		}else{
		System.out.println("Welcome to the club " + name + ", let's get down to the vibe!!!\n");
		}

		scanner.close(); // closing the scanner object after using it.(Good practise per recommendations from various resources)


	}
}

import java.util.Scanner;

public class example01{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n\nEnter your name here: ");
		String name = scanner.next();
		
		System.out.println("\nHello there " + name + ", welcome to our Club!\n");
		scanner.nextLine();

		System.out.println("Enter your age here: ");
		int age = scanner.nextInt();

		System.out.println("You entered: "+age);
		System.out.println("Meaning you are " + age + " years old!\n");
                scanner.nextLine();
		
		// inserting and using a few conditional statements.

		if(age <= 18){
		System.out.println("You just a kid, for christsake, just go back home to mummy " + name + "!\n");
		}else if(age == 19 ){
		System.out.println(name + ", You are still a teenager, not yet of age to be allowed inside!\n");
		}else{
		System.out.println("Welcome to the club " + name + ", let's get down to the vibe!!!\n");
		}



	}
}

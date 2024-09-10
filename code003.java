import java.util.Scanner;

public class code003{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your age here: ");
	int age = scanner.nextInt();
	System.out.println("Age is: " + age);

	scanner.nextLine();
	System.out.print("Enter your first name here: ");
	String firstname = scanner.next();
	System.out.println("Firstname: " + firstname);
	scanner.nextLine();
	System.out.print("Enter your lastname here: ");
	String lastname = scanner.next();
	System.out.println("Lastname: " + lastname);
	scanner.nextLine();
	System.out.println("Your name is: " + firstname + " " + lastname + " and you are " + age + " years old!");
	
	scanner.close();
	}
}

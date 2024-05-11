package Program;
import java.util.Scanner;
import entities.JavaObjEntities;

public class JavaObjProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Information Data: ");
		
		System.out.print("Enter with your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter with your last Name: ");
		String lastName = scanner.nextLine();
		
		System.out.print("Enter with your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		JavaObjEntities obj1 = new JavaObjEntities(name, lastName, age);
		
		obj1.setName(name);
		obj1.setLastName(lastName);
		obj1.setAge(age);
		
		System.out.println();
		
		System.out.println("Updated Data: ");
		
		obj1.setName("José");
		System.out.println(obj1.getName());
		
		System.out.println();
		
		System.out.println("Output Data: ");
		
		System.out.println("Name: " + obj1.getName());
		System.out.println("LastName: " + obj1.getLastName());
		System.out.println("Age: " + obj1.getAge());
		
		scanner.close();

	}

}

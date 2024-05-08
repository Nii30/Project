import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Service s = new Service();
		System.out.println("-------------------Product Management System------------------------");
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of Database ");
		int size = ip.nextInt();
		s.createDatabse(size);
		
		while(true)
		{
			System.out.println("-----------------MENU-----------------------");
			System.out.println("1. Add Product \n2. Find by ID");
			System.out.println("3. Find by Company \n4. Update by ID");
			System.out.println("5. All Details \n6. Exit");
			System.out.println("Enter the Option");
			int op = ip.nextInt();
			
			
			switch(op)
			{
			case 1: s.addProduct(); break;
			case 2: s.findByID(); break;
			case 3: s.update(); break;
			case 4: s.delete(); break;
			
			case 5: System.out.println("NOT IMPLTD"); break;
			case 6: System.out.println("Thank you.....!!!!!!!!!!");
			System.exit(0);
			default:
		
			
			
			}
		}
		
		
	}
}

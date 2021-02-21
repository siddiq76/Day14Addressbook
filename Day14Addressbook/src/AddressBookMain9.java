
import java.util.Scanner;

public class AddressBookMain9 {

	public static void main(String[] args) {
		
		Operations9 operations = new Operations9();
		
		System.out.println("------------------------------------------------");
		System.out.println("---Address Book Program---");
		System.out.println("------------------------------------------------");
		System.out.println(" ");
		System.out.println("1. Add User(s) Information .");
		System.out.println("2. View User(s) Information .");
		System.out.println("3. Search Information by City .");
		System.out.println("4. Search Information by State .");
		System.out.println("5. Delete Information by First-Name .");
		System.out.println("6. Sort Information by First-Name .");
		System.out.println("7. Sort Information by State .");
		System.out.println("8. Edit Information by First-Name .");
		System.out.println(" ");
		System.out.println("------------------------------------------------");
	
		Scanner scan = new Scanner(System.in);
		
		int option = 0;
		do {
		int option1 = scan.nextInt();
		
		switch(option1) {
		
		case 1:
			System.out.println("---");
			operations.addInformation();
			System.out.println("---");
			break;
			
		case 2:
			System.out.println("---");
			operations.viewInformation();
			System.out.println("---");
			break;
			
		case 3:
			System.out.println("---");
			operations.searchInformationByCity();
			System.out.println("---");
			break;
			
		case 4:
			System.out.println("---");
			operations.searchInformationByState();
			System.out.println("---");
			break;
			
		case 5:
			System.out.println("---");
			operations.deleteInformationByFirstName();
			System.out.println("---");
			break;
			
		case 6:
			System.out.println("---");
			operations.sortByFirstName();
			System.out.println("---");
			break;
			
		case 7:
			System.out.println("---");
			operations.sortByState();
			System.out.println("---");
			break;
		
		case 8:
			System.out.println("---");
			operations.editInformation();
			System.out.println("---");
			break;
			
		}
		}while(option != 8);

	}
}

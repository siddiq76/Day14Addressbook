
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Operations8{
	
	ArrayList<Person> person = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in); 
	
	public void addInformation() {                                  //Add users Method
		
		Person personInfo = new Person();
		
		System.out.println("Enter First-Name -");
		personInfo.setFirstName(scan.nextLine());
		
		System.out.println("Enter Last-Name -");
		personInfo.setLastName(scan.nextLine());
		
		System.out.println("Enter Address -");
		personInfo.setAddress(scan.nextLine());
		
		System.out.println("Enter State -");
		personInfo.setState(scan.nextLine());
		
		System.out.println("Enter City -");
		personInfo.setCity(scan.nextLine());
		
		System.out.println("Enter Zip-Code -");
		personInfo.setZipCode(scan.nextLine());
		
		System.out.println("Enter Phone-Number -");
		personInfo.setPhoneNumber(scan.nextLine());
		
	
		person.add(personInfo);
		
		System.out.println(" ");
		System.out.println("--Information Stored--");
		
	}
	
	public void viewInformation() {                                         //Get users Method
		
		for(int i = 0 ; i < person.size() ; i++) {
			System.out.println(" ");
			System.out.println(person.get(i));
			System.out.println(" ");
		}
		
	}
	
	public void searchInformationByCity() {                                       //Search by City Method
		
			System.out.println("*Enter City to search records-");
			String city = scan.nextLine();
			
			if(person.isEmpty()) {
				System.out.println("No such record found.");
			}
			
			for(int i = 0 ; i < person.size() ; i++) {
				if(person.get(i).getCity().equals(city)) {
					
					System.out.println(" ");
					System.out.println(person.get(i));		
				}
			}				
	}
	
	public void searchInformationByState() {                                       //Search by State Method
		
		System.out.println("*Enter State to search records-");
		String state = scan.nextLine();
		
		if(person.isEmpty()) {
			System.out.println("No such record found.");
		}
		
		for(int i = 0 ; i < person.size() ; i++) {
			if(person.get(i).getState().equals(state)) {
				
				System.out.println(" ");
				System.out.println(person.get(i));		
			}
		}				
}
	
	public void deleteInformationByFirstName() {                                     //Delete record by First-Name
		
		System.out.println("*Enter First-Name to delete from records-");
		String fName = scan.nextLine();
		
		if(person.isEmpty()) {
			System.out.println("No such record found to delete.");
		}
		
		for(int i = 0 ; i < person.size() ; i++) {
			if(person.get(i).getFirstName().equals(fName)) {
				
				person.remove(i);
				System.out.println("--Record Deleted--");
			}		
		}	
	}
	
	public void sortByFirstName() {                                              //Sort by First-Name Method
		
		Collections.sort(person, new Comparator<Person>(){
		
		    public int compare(Person oneName ,Person twoName) {
			    return String.valueOf(oneName.firstName).compareTo(twoName.firstName);
		    }
	    });
		
		System.out.println("Sorted by First-Name Alphabetically-");
		
		for(int i = 0 ; i < person.size() ; i++) {
			System.out.println(" ");
			System.out.println(person.get(i));
			System.out.println(" ");
		}
	}
		
       public void sortByState() {                                                  //Sort by State Method
		
		Collections.sort(person, new Comparator<Person>(){
		
		    public int compare(Person oneState ,Person twoState) {
			    return String.valueOf(oneState.state).compareTo(twoState.state);
		    }
	    });
		
		System.out.println("Sorted by State Alphabetically-");
		
		for(int i = 0 ; i < person.size() ; i++) {
			System.out.println(" ");
			System.out.println(person.get(i));
			System.out.println(" ");
		}
	}
	
	
	public void editInformation() {                                                //Edit Information Method 
    	
    	System.out.println("Enter First-Name to edit record-");
    	String fNameToUpdate = scan.nextLine();
    	
    	for(int i = 0 ; i < person.size() ; i++) {
    		
    		if(person.get(i).getFirstName().equals(fNameToUpdate)) {
    	
    	Person personInfo = new Person();
    	
    	System.out.println("Enter First-Name -");
		personInfo.setFirstName(scan.nextLine());
		
		System.out.println("Enter Last-Name -");
		personInfo.setLastName(scan.nextLine());
		
		System.out.println("Enter Address -");
		personInfo.setAddress(scan.nextLine());
		
		System.out.println("Enter State -");
		personInfo.setState(scan.nextLine());
		
		System.out.println("Enter City -");
		personInfo.setCity(scan.nextLine());
		
		System.out.println("Enter Zip-Code -");
		personInfo.setZipCode(scan.nextLine());
		
		System.out.println("Enter Phone-Number -");
		personInfo.setPhoneNumber(scan.nextLine());
		
		person.set(i, personInfo);
    }
    	}
    }
	
	
	
}
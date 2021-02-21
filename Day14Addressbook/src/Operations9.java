import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Operations9{
	
	ArrayList<Person> person9 = new ArrayList<>();
	
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
		
	
	        person9.add(personInfo);	    
	    
	        person9=(ArrayList<Person>) person9.stream().distinct().collect(Collectors.toList());    //Stream to reject data with same First&Last Name.
		
	}
	
	public void viewInformation() {                                         //Get users Method
		
		for(int i = 0 ; i < person9.size() ; i++) {
			System.out.println(" ");
			System.out.println(person9.get(i));
			System.out.println(" ");
		}
		
	}
	
	public void searchInformationByCity() {                                       //Search by City Method
		
			System.out.println("*Enter City to search records-");
			String city = scan.nextLine();
			
			if(person9.isEmpty()) {
				System.out.println("No such record found.");
			}
			
			for(int i = 0 ; i < person9.size() ; i++) {
				if(person9.get(i).getCity().equals(city)) {
					
					System.out.println(" ");
					System.out.println(person9.get(i));		
				}
			}				
	}
	
	public void searchInformationByState() {                                       //Search by State Method
		
		System.out.println("*Enter State to search records-");
		String state = scan.nextLine();
		
		if(person9.isEmpty()) {
			System.out.println("No such record found.");
		}
		
		for(int i = 0 ; i < person9.size() ; i++) {
			if(person9.get(i).getState().equals(state)) {
				
				System.out.println(" ");
				System.out.println(person9.get(i));		
			}
		}				
}
	
	public void deleteInformationByFirstName() {                                     //Delete record by First-Name
		
		System.out.println("*Enter First-Name to delete from records-");
		String fName = scan.nextLine();
		
		if(person9.isEmpty()) {
			System.out.println("No such record found to delete.");
		}
		
		for(int i = 0 ; i < person9.size() ; i++) {
			if(person9.get(i).getFirstName().equals(fName)) {
				
				person9.remove(i);
				System.out.println("--Record Deleted--");
			}		
		}	
	}
	
	public void sortByFirstName() {                                              //Sort by First-Name Method
		
		Collections.sort(person9, new Comparator<Person>(){
		
		    public int compare(Person oneName ,Person twoName) {
			    return String.valueOf(oneName.firstName).compareTo(twoName.firstName);
		    }
	    });
		
		System.out.println("Sorted by First-Name Alphabetically-");
		
		for(int i = 0 ; i < person9.size() ; i++) {
			System.out.println(" ");
			System.out.println(person9.get(i));
			System.out.println(" ");
		}
	}
		
       public void sortByState() {                                                  //Sort by State Method
		
		Collections.sort(person9, new Comparator<Person>(){
		
		    public int compare(Person oneState ,Person twoState) {
			    return String.valueOf(oneState.state).compareTo(twoState.state);
		    }
	    });
		
		System.out.println("Sorted by State Alphabetically-");
		
		for(int i = 0 ; i < person9.size() ; i++) {
			System.out.println(" ");
			System.out.println(person9.get(i));
			System.out.println(" ");
		}
	}
	
	
	public void editInformation() {                                                //Edit Information Method 
    	
    	System.out.println("Enter First-Name to edit record-");
    	String fNameToUpdate = scan.nextLine();
    	
    	for(int i = 0 ; i < person9.size() ; i++) {
    		
    		if(person9.get(i).getFirstName().equals(fNameToUpdate)) {
    	
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
		
		person9.set(i, personInfo);
    }
    	}
    }
	
	
	
	

}
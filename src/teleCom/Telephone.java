//Gabrielle Watson - 1603805, Antoinne Stewart - 1604833
package teleCom;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Telephone {
	protected int AreaCode;
	protected int prefix;
	protected String SerialNumber;
	private Scanner number;
	
	public Telephone ()// Default Constructor
	
	{
		AreaCode=0;
		prefix=0;
		SerialNumber="";
	}
	
	
	// Primary Constructor 
	  public Telephone (int CustomerNo, int AreaCode, int prefix, int CompanyId2) {
		//super(CreditBalance, CustomerId, LastName,Address,CompanyId,ProviderAddress, CustomerNo); // Attributes from parent class 
		this.AreaCode = 0;
		this.prefix = prefix;
		this.SerialNumber = SerialNumber;
	}
	
	  // Getters and Setters
	public int getAreaCode() {
		return AreaCode;
	}
	
	public String getSerialNumber()
	{
		return SerialNumber;
	}
	
	public int prefix() {
		return prefix;
	}
	
	
	
	public String SerialNumber() {
		return SerialNumber;
	}
	
	
	public void DigiAddNumber() { // Function to add a digicel number 
		boolean InputError = false;
		boolean InputError1 = false;
		boolean InputError2 = false;
		number= new Scanner(System.in);
		
		while(!InputError) {
			try {
				System.out.println("Please enter area code");
				AreaCode = number.nextInt();
				InputError = true;
			} catch(InputMismatchException e) {
				System.out.println("Please enter an integer");
				number.next();
			}
		}
		
		while(!InputError1) {
			try {
				System.out.println("Please enter prefix");
				prefix = number.nextInt();
				InputError1 = true;
			} catch(InputMismatchException e) {
				System.out.println("Please enter an integer");
				number.next();
			}
		}
		
		while(!InputError2){
			try {
				System.out.println("Please enter serial number");
				SerialNumber = number.next();
				InputError2 = true;
			} catch(InputMismatchException e) {
				System.out.println("Please enter an integer");
				number.next();
			}
		}
		
		System.out.println("Customer add successful");
	try { // Start of try blocl 
		 File file = new File("Digicel_Customers.txt"); // Creating the DigicelCustomer file 

		 if(!file.exists()) { // Check to ensure the file was created
			 file.createNewFile(); // If file was not created this line calls the create new file 
			 
		 }
		 
		 PrintWriter pw = new PrintWriter(new FileWriter(file, true));
		 pw.print(AreaCode);
		 pw.print(" ");
		 pw.print(prefix );
		 pw.print(SerialNumber);
		 pw.print(" ");
		 pw.println(" ");
		 pw.close();
		 
	}
catch (IOException e)
{
System.err.println(
"Error, user information could not be stored.");
e.printStackTrace();
}
}
	
public void FlowAddNumber() {
		
	boolean InputError = false;
	boolean InputError1 = false;
	boolean InputError2 = false;
	number= new Scanner(System.in);
	
	while(!InputError) {
		try {
			System.out.println("Please enter area code");
			AreaCode = number.nextInt();
			InputError = true;
		} catch(InputMismatchException e) {
			System.out.println("Please enter an integer");
			number.next();
		}
	}
	
	while(!InputError1) {
		try {
			System.out.println("Please enter prefix");
			prefix = number.nextInt();
			InputError1 = true;
		} catch(InputMismatchException e) {
			System.out.println("Please enter an integer");
			number.next();
		}
	}
	
	while(!InputError2){
		try {
			System.out.println("Please enter serial number");
			SerialNumber = number.next();
			InputError2 = true;
		} catch(InputMismatchException e) {
			System.out.println("Please enter an integer");
			number.next();
		}
	}
		
		System.out.println("Customer add successful");
	
	try {
		 File file = new File("Flow_Customers.txt");

		 if(!file.exists()) {
			 file.createNewFile();
		 }
		 
		 PrintWriter pw = new PrintWriter(new FileWriter(file, true));
		 pw.print(AreaCode);
		 pw.print(" ");
		 pw.print(prefix );
		 pw.print(SerialNumber);
		 pw.print(" ");
		 pw.println(" ");
		 pw.close();
		 
	}
catch (IOException e) // Handles the exception thrown 
{
System.err.println(
"Error, user information could not be stored.");
e.printStackTrace();
}
}
}



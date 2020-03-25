//Gabrielle Watson - 1603805, Antoinne Stewart - 1604833
package teleCom;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Customer{
	protected int CustomerId; 
	protected String LastName;
	protected String Address;
	protected String CreditBalance;
	private Scanner info;
	private Telephone telephone;
	private PhoneCredit phonecredit;
	
	public Customer()// Default Constructor
	{
	CustomerId=0;
	LastName="";
	Address="";
	CreditBalance="";
	}
	
	public Customer (String CreditBalance, int CustomerId, String LastName, String Address) 
	{
		//super(CompanyId, ProviderAddress, CustomerNo);
		this.CustomerId = CustomerId;
		this.LastName = LastName;
		this.Address = Address;
		Telephone tele = new Telephone();
		telephone = tele;
		this.CreditBalance = CreditBalance;
	}
	
	// Accessors and Mutators
	public int getCustomerId() {
		return CustomerId;
	}
	
	public void setCustomerId (int CustomerId) {
		this.CustomerId = CustomerId;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName (String LastName) {
		this.LastName = LastName;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getCreditBalance() {
		return CreditBalance;
	}
	
	public void setCreditBalance (String CreditBalance) {
		this.CreditBalance = CreditBalance;
	}
	
	public void DigiAddInfo() {
		int x=0, x1=0, x2 = 0;
		boolean InputError = false;
		boolean InputError1 = false;
		boolean InputError2 = false;
		Scanner info = new Scanner(System.in);
		
	
		while(!InputError) { // Loop to collect customer's info
			try { // Try block to ensure no input mismatch
				System.out.println("Please enter Customer's last name");
				LastName = info.nextLine();
			    InputError = true;
			} catch(InputMismatchException e) {
				System.out.println("Please enter a string");
				info.next();
			}
		}
	 
   
		while(!InputError1) {
			 try {
			    System.out.println("Please enter Customer's ID");
				CustomerId = info.nextInt();
				InputError1 = true;
			 } catch(InputMismatchException e) {
			    	System.out.println("Please enter an integer");
			    	info.next();
			    }  
	    }
    
		
		while(!InputError2) {
			try {
				System.out.println("Please enter Customer's Address");
				Address = info.next();
				InputError2 = true;
			} catch(InputMismatchException e) {
				System.out.println("Please enter a string");
				info.next();
			}
		}
		
		CreditBalance = "100";
		
		try { // start of try block
			 File file = new File("Digicel_Customers.txt");

			 if(!file.exists()) {
				 file.createNewFile();
			 }
			 
			 PrintWriter pw = new PrintWriter(new FileWriter(file, true));
			 pw.print(LastName);
			 pw.print(" ");
			 pw.print(CustomerId);
			 pw.print(" ");
			 pw.print(Address);
			 pw.print(" ");
			 pw.print(CreditBalance);
			 pw.print(" ");
			 pw.close();
			 
		}// end of try block
	catch (IOException e) // catch Exception
	{
	System.err.println(
	"Error, user information could not be stored.");
	e.printStackTrace();
	}
		Scanner pauser = new Scanner (System.in);
		pauser.nextLine();

	}

public void FlowAddInfo() {
	int x=0, x1=0, x2 = 0;
	boolean InputError = false;
	boolean InputError1 = false;
	boolean InputError2 = false;
	Scanner info = new Scanner(System.in);
	

	while(!InputError) { // Loop to collect customer's info
		try { // Try block to ensure no input mismatch
			System.out.println("Please enter Customer's last name");
			LastName = info.nextLine();
		    InputError = true;
		} catch(InputMismatchException e) {
			System.out.println("Please enter a string");
			info.next();
		}
	}
 

	while(!InputError1) {
		 try {
		    System.out.println("Please enter Customer's ID");
			CustomerId = info.nextInt();
			InputError1 = true;
		 } catch(InputMismatchException e) {
		    	System.out.println("Please enter an integer");
		    	info.next();
		    }  
    }

	
	while(!InputError2) {
		try {
			System.out.println("Please enter Customer's Address");
			Address = info.next();
			InputError2 = true;
		} catch(InputMismatchException e) {
			System.out.println("Please enter a string");
			info.next();
		}
	}
	
	CreditBalance = "100";

	try { // start of try block
		 File file = new File("Flow_Customers.txt");

		 if(!file.exists()) {
			 file.createNewFile();
		 }
		 
		 PrintWriter pw = new PrintWriter(new FileWriter(file, true));
		 pw.print(LastName);
		 pw.print(" ");
		 pw.print(CustomerId );
		 pw.print(" ");
		 pw.print(Address);
		 pw.print(" ");
		 pw.print(CreditBalance);
		 pw.print(" ");
		 pw.close();
		 
	}// end of try block
catch (IOException e) // catch Exception
{
System.err.println(
"Error, user information could not be stored.");
e.printStackTrace();
}
	System.out.println("Customer add successful");
	Scanner pauser = new Scanner (System.in);
	pauser.nextLine();

}

public void FlowViewInfo() {
	try {
		BufferedReader in = new BufferedReader(new FileReader("Flow_Customers.txt"));		
		String line;
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
		}
		in.close();
	}
	catch (IOException e)
	{
	System.err.println(
	"Error, user information could not be stored.");
	e.printStackTrace();
	}
}

public void DigiViewInfo() {
	try {
		BufferedReader in = new BufferedReader(new FileReader("Digicel_Customers.txt"));		
		String line;
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
		}
		in.close();
	}
	catch (IOException e)
	{
	System.err.println(
	"Error, user information could not be stored.");
	e.printStackTrace();
	}
}
}
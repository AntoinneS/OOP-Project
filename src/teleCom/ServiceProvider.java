//Gabrielle Watson - 1603805, Antoinne Stewart - 1604833
package teleCom;
import java.io.*;
import java.lang.*;
import java.util.*;

public class ServiceProvider {
	protected int CompanyId;
	protected String ProviderAddress;
	protected static int CustomerNo;
	private Scanner customer;
	protected FileWriter fileObject;
	
	
	
	public ServiceProvider() // Default Constructor 
	{
		CompanyId=0;
		ProviderAddress="";
		CustomerNo=0;
		
	}
	
	public ServiceProvider(int CompanyId, String ProviderAddress, int CustomerNo)// Primary Constructor
	{
		this.CompanyId = CompanyId;
		this.ProviderAddress = ProviderAddress;
		this.CustomerNo = CustomerNo;
	}
	
	
	
	// Accessors and Mutators
	public int getCompanyId() {
		return CompanyId;
	}
	
	public String getProviderAddress() {
		return ProviderAddress;
	}
	
	public static int getCustomerNo() {
		return CustomerNo;
	}
	
public void AddCustomer() // Function to add new customer
{
	Customer addCustomer = new Customer();
	addCustomer.DigiAddInfo();
	
	Telephone addTelephone = new Telephone();
	addTelephone.DigiAddNumber();
	
	Customer adCustomer = new Customer();
	addCustomer.FlowAddInfo();

	Telephone adTelephone = new Telephone();
	addTelephone.FlowAddNumber();
	}

public void ViewCustomer() {
	Customer viewCustomer = new Customer();
	viewCustomer.DigiViewInfo();
	
	Customer vieCustomer = new Customer();
	viewCustomer.FlowViewInfo();

}

public void DisplayInformation() {
	System.out.println("Digicel is a mobile phone network operating in 31 markets across the Caribbean, Central America, and Oceania regions.\n  The company is owned by Irish billionaire Denis O'Brien. \n The company is incorporated in Bermuda and is based in Jamaica. \n The company has about 14 million users.");

	System.out.println(" FLOW was formerly a brand of Columbus Communications providing residential and business telephone, Internet and television services across the Caribbean.\n The brand was used by individual companies operating in each country, registered under the Columbus Communications name.");
}

}

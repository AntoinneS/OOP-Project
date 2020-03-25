//Gabrielle Watson - 1603805, Antoinne Stewart - 1604833
package teleCom;
import java.io.*;
import java.util.*;

public class Digicel extends ServiceProvider{
	
	public Digicel() // Default Constructor
	{
		super(); // referencing attributes from the parent class
	}
	
	public Digicel(int CompanyId, String ProviderAddress, int CustomerNo) // Primary Constructor
	{
		super(CompanyId, ProviderAddress, CustomerNo);
	}
	
public void addCustomer() {
	   
		Customer addCustomer = new Customer();
		addCustomer.DigiAddInfo();
		
		Telephone addTelephone = new Telephone();
		addTelephone.DigiAddNumber();
	}

public void ViewCustomer() {
	Customer viewCustomer = new Customer();
	viewCustomer.DigiViewInfo();
}

public void DisplayInformation() {
	System.out.println("Digicel is a mobile phone network operating in 31 markets across the Caribbean, Central America, and Oceania regions.\n  The company is owned by Irish billionaire Denis O'Brien. \n The company is incorporated in Bermuda and is based in Jamaica. \n The company has about 14 million users.");
}

}

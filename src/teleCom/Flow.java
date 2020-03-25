//Gabrielle Watson - 1603805, Antoinne Stewart - 1604833
package teleCom;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Flow extends ServiceProvider{
    protected Formatter x;
    
    public Flow () // Default Constructor 
    {
    	super();
    }
	public Flow(int CompanyId, String ProviderAddress, int CustomerNo) // Primary Constructor 
	{
		super(CompanyId, ProviderAddress, CustomerNo);
	}
	
public void AddCustomer() {
	
		Customer addCustomer = new Customer();
		addCustomer.FlowAddInfo();

		Telephone addTelephone = new Telephone();
		addTelephone.FlowAddNumber();
		
	}
public void ViewCustomer() {
	Customer viewCustomer = new Customer();
	viewCustomer.FlowViewInfo();
}
public void DisplayInformation() {
	System.out.println(" FLOW was formerly a brand of Columbus Communications providing residential and business telephone, Internet and television services across the Caribbean.\n The brand was used by individual companies operating in each country, registered under the Columbus Communications name.");
}
}
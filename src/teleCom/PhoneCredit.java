//Gabrielle Watson - 1603805, Antoinne Stewart - 1604833
package teleCom;
import java.io.*; 
import java.lang.*;
import java.math.BigInteger;
import java.util.*;

public class PhoneCredit extends Customer {
	protected BigInteger cardNumber;
	protected int cardAmount;
	protected String cardStatus;
	private Scanner credit;
	private String Telenum;
	int x;
	int z;

	public PhoneCredit (String CreditBalance, int CustomerId, String LastName, String Address,int CompanyId, String ProviderAddress) {
		super();
		this.cardAmount = cardAmount;
		this.cardStatus = cardStatus;
		
	} 
	 public BigInteger getcardNumber() {
		 return cardNumber;
	 }
	
	 public int getcardAmount() {
		 return cardAmount;
	 }
	 
	 public String cardStatus() {
		 return cardStatus;
	 }
	 
	public void FlowCreateCredit() {
		
		int[] amount = {100, 200, 500, 1000};
		Random rand = new Random();
		int rando = rand.nextInt(4) + 0;
		
		cardStatus = "Available";
		cardAmount = amount[rando];
		
		 BigInteger max = new BigInteger("9999999999999");
	     BigInteger min = new BigInteger("1111111111111");
	     BigInteger bigInteger1 = max.subtract(min);
	     Random rnd = new Random();
		 int maxNumBitLength = max.bitLength();

		 cardNumber = new BigInteger(maxNumBitLength, rnd);
		  if (cardNumber.compareTo(min) < 0)
		   cardNumber = cardNumber.add(min);
		  if (cardNumber.compareTo(max) >= 0)
		   cardNumber = cardNumber.mod(bigInteger1).add(min);
		    
		  System.out.println("This card is worth   $" +cardAmount + " The Card Number is  "+ cardNumber +  "  This card is  " +cardStatus);
		    try {
			 File file = new File("Flow_CardInformation.txt");

			 if(!file.exists()) {
				 file.createNewFile();
			 }
			 
			 PrintWriter pw = new PrintWriter(new FileWriter(file, true));
			 pw.print(cardAmount);
			 pw.print(" ");
			 pw.print(cardNumber );
			 pw.print(" ");
			 pw.print(cardStatus);
			 pw.println(" ");
			 pw.close();
			 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
	}
	
public void DigiCreateCredit() {
		
		int[] amount = {100, 200, 500, 1000};
		Random rand = new Random();
		int rando = rand.nextInt(4) + 0;
		
		cardStatus = "Available";
		cardAmount = amount[rando];
		
		 BigInteger max = new BigInteger("9999999999999");
	     BigInteger min = new BigInteger("1111111111111");
	     BigInteger bigInteger1 = max.subtract(min);
	     Random rnd = new Random();
		 int maxNumBitLength = max.bitLength();

		 cardNumber = new BigInteger(maxNumBitLength, rnd);
		  if (cardNumber.compareTo(min) < 0)
		  cardNumber = cardNumber.add(min);
		  if (cardNumber.compareTo(max) >= 0)
		   cardNumber = cardNumber.mod(bigInteger1).add(min);
		    
		  System.out.println("This card is worth   $" +cardAmount + " The Card Number is  "+ cardNumber +  "  This card is  " +cardStatus);
		    try {
			 File file = new File("Digicel_CardInformation.txt");

			 if(!file.exists()) {
				 file.createNewFile();
			 }
			
			 PrintWriter pw = new PrintWriter(new FileWriter(file, true));
			 pw.print(cardAmount);
			 pw.print(" ");
			 pw.print(cardNumber );
			 pw.print(" ");
			 pw.print(cardStatus);
			 pw.println(" ");
			 pw.close();
			 
		 } catch (IOException e) {
			 e.printStackTrace();
		 }

	}
		    public void FlowAddCredit() {
		    String asterik;
		    BigInteger num;
		    int areaCode;   
		    String hashtag;
		    String accept;
		    boolean InputError = false;
			boolean InputError1 = false;
			boolean InputError2 = false; 
		    credit = new Scanner(System.in);
		    
		    do {
		    	System.out.println("Dial *121*");
		    	asterik = credit.nextLine();
	
		    if (asterik.equals("*121*")) 
		    	x = 2;
		    } while(x != 2);
		    
			
		        FlowCreateCredit();
			    //while(!InputError) {
			    //	try {
			    		System.out.println("This card is worth   $" +cardAmount + " The Card Number is  "+ cardNumber +  "  This card is  " +cardStatus);
			    		System.out.println(" \n \n Please enter the card number provided above");
			    		num = credit.nextBigInteger();
			    		//InputError1 = true;
			    	//} catch(InputMismatchException e) {
						System.out.println("Please enter an integer");
						credit.next();
					//}
			//	}
			    
		        if (num.equals(cardNumber)) {
		        	System.out.println("Enter a '*', followed by your area code and phone number then enter '#'' (SPACE INBETWEEN EACH INPUT)");
		        	accept = credit.next();
		        	areaCode = credit.nextInt();
		        	Telenum = credit.next();
		        	hashtag = credit.next();
		        	
		        	String prefix = Telenum.substring(0,3);
		        	
		        	if((prefix == "601") || (prefix == "602")|| (prefix == "603") || (prefix == "604")) {

		        		   File fil = new File("Flow_Customers.txt");
		        		   try {
		        		     BufferedReader ur = new BufferedReader(new FileReader(fil));
		        		  
		        		     String line;
		        		     while ((line = ur.readLine()) != null) {
		        		         
		        		    	   Customer cred = new Customer();
			        		         cred.getCreditBalance();        		         
		        		         if (line.contains(Telenum))  {
		        		            System.out.println(line);
		        		            if(line.contains(CreditBalance)) {
		        		            int cB = Integer.parseInt(CreditBalance);
		        		            int newBalance = cB + cardAmount;
		        		            String newB = String.valueOf(newBalance);
		        		            line = line.replace(CreditBalance, newB);
		        		            System.out.println("Your new balance is :" + newB);
		        		         }
		        		         }
		        		     }

		        		   } catch (FileNotFoundException e) {
		        		       e.printStackTrace();
		        		       
		        		   } catch (IOException e) {
		        		       e.printStackTrace();
		        		   }
		        		   
		        		   ArrayList<String> lines = new ArrayList<String>();
		        			  
		       		    try
		       	        {
		       		    	File file = new File("Flow_CardInformation.txt");
		       	            FileReader fr = new FileReader(file);
		       	            BufferedReader ba = new BufferedReader(fr);
		       	            String line = null;
		       	            while ((line = ba.readLine()) != null)  {
		       	                if (line.contains("Available")) {
		       	                System.out.println(cardNumber);
		       	               }
		       	            }
		       	            
		       	            fr.close();
		       	            ba.close();
		       	       
		       	        } catch (Exception ex) {
		       	            ex.printStackTrace();
		       	          }
		       		 
		       		    try
		       	        {
		       		    	File file = new File("Flow_CardInformation.txt");
		       	            FileReader fr = new FileReader(file);
		       	            BufferedReader bc = new BufferedReader(fr);
		       	          String line = null;
		       	            while ((line = bc.readLine()) != null) 
		       	            {
		       	                if (line.contains("Available")) {
		       	                    line = line.replace("Available", "Used");
		       	                    lines.add(line);
		       	                    line = null;
		       	            }
		       	            }
		       	            
		       	            fr.close();
		       	            bc.close();
		       	            
		       	            FileWriter fw = new FileWriter(file);
		       	            BufferedWriter out = new BufferedWriter(fw);
		       	    
		       	             for( String s : lines) {
		       	           
		       	            	 out.append(s);
		       	            	 out.newLine();
		       	                out.flush();
		       	             }
		       	                out.close();
		       	              } catch (Exception ex) {
		       	            ex.printStackTrace();
		       	        }
		        	}
		        	else {
		        		System.out.println("Invalid phone number entered");
		        	}
		        }
		        else {
		        	System.out.println("Error");
		        }
		   
	      
		  	}
		    public void DigiAddCredit() {
			    String asterik;
			    BigInteger num;
			    boolean InputError = false;
			    int areaCode;
			    String hashtag;
			    String accept;
			    
			    credit = new Scanner(System.in);
			    do {
			    System.out.println("Dial *121*");
			    asterik = credit.nextLine();
			    
			    if (asterik.equals("*121*")) 
			    	z = 2;
			    }while(z!=2);
			    
			    	DigiCreateCredit();
			    	 //while(!InputError) {
					   // 	try {
					    		System.out.println("This card is worth   $" +cardAmount + " The Card Number is  "+ cardNumber +  "  This card is  " +cardStatus);
					    		System.out.println(" \n \n Please enter the card number provided above");
					    		num = credit.nextBigInteger();
					    //		InputError = true;
					    	//} catch(InputMismatchException e) {
								//System.out.println("Please enter an integer");
								//credit.next();
							//}
					//	}
			        
			        if (num.equals(cardNumber)) {
			        	System.out.println("Enter a '*', followed by your area code and phone number then enter '#'' (SPACE INBETWEEN EACH INPUT)");
			        
			        	Telenum = credit.next();
			        	
			        	
			        	String prefix = Telenum.substring(0,3);
			        	
			        	if((prefix == "301") || (prefix == "302")|| (prefix == "303") || (prefix == "304")) {
			        		  Scanner input = new Scanner(System.in);

			        		   File fil = new File("Digicel_Customers.txt");
			        		   try {
			        		     BufferedReader ur = new BufferedReader(new FileReader(fil));
			        		  
			        		     String line;
			        		     while ((line = ur.readLine()) != null) {
			        		         
			        		         
			        		         if (line.contains(Telenum))  {
			        		            System.out.println(line);
			        		            if(line.contains(CreditBalance)) {
			        		            int cB = Integer.parseInt(CreditBalance);
			        		            int newBalance = cB + cardAmount;
			        		            String newB = String.valueOf(newBalance);
			        		            line = line.replace(CreditBalance, newB);
			        		            System.out.println("Your new balance is :" + newB);
			        		         }
			        		         }
			        		     }

			        		   } catch (FileNotFoundException e) {
			        		       e.printStackTrace();
			        		   } catch (IOException e) {
			        		       e.printStackTrace();
			        		   }
			        		   
			        		   ArrayList<String> lines = new ArrayList<String>();
			     			  
			   			    try
			   		        {
			   			    	File file = new File("Digicel_CardInfomation.txt");
			   		            FileReader fr = new FileReader(file);
			   		            BufferedReader ba = new BufferedReader(fr);
			   		            String line = null;
			   		            while ((line = ba.readLine()) != null) 
			   		            {
			   		                if (line.contains("Available")) {
			   		                System.out.println(cardNumber);
			   		            }
			   		            }
			   		            fr.close();
			   		            ba.close();
			   		        } catch (Exception ex) {
			   		            ex.printStackTrace();
			   		        }
			   			  
			   			    try
			   		        {
			   			    	File file = new File("Digicel_CardInfomation.txt");
			   		            FileReader fr = new FileReader(file);
			   		            BufferedReader bc = new BufferedReader(fr);
			   		          String line = null;
			   		            while ((line = bc.readLine()) != null) 
			   		            {
			   		                if (line.contains("Available")) {
			   		                    line = line.replace("Available", "Used");
			   		                    lines.add(line);
			   		                    line = null;
			   		            }
			   		            }
			   		            fr.close();
			   		            bc.close();
			   		            
			   		            FileWriter fw = new FileWriter(file);
			   		            BufferedWriter out = new BufferedWriter(fw);
			   		    
			   		             for( String s : lines) {
			   		           
			   		            	 out.append(s);
			   		            	 out.newLine();
			   		                out.flush();
			   		             }
			   		                out.close();
			   		              } catch (Exception ex) {
			   		            ex.printStackTrace();
			   		        }
			        	}
			        	else {
			        		System.out.println("Invalid phone number entered");
			        	}
			        }
			        else {
			        	System.out.println("Incorrect entry");
			        }
		      
	
			    	
			   // System.exit(0); // Program will stop here just testing what is above, cuz this already works

			   
			  	}
		    
		    public void DigiViewCredit() {
		    	try {
					BufferedReader in = new BufferedReader(new FileReader("Digicel_CardInfomation.txt"));		
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
		    public void FlowViewCredit() {
		    	try {
					BufferedReader in = new BufferedReader(new FileReader("Flow_CardInfomation.txt"));		
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
		    
		    public void CheckBalance() {
		    	String asterik2; 
		    	Scanner cBalance = new Scanner(System.in);
		    	do {
		    		   
					    System.out.println("Dial *120*");
					    asterik2 = cBalance.next();
					    
					    if (asterik2.equals("*120*")) 
					    	z = 2;
					    }while(z!=2);
		    
				    System.out.println("Enter your phone number");
				    String number = cBalance.next();
				    
                    String findNum = number.substring(0,3);
		        	System.out.println("Prefix is " + findNum);
		        	
		        	if((findNum.equals ("601")) || (findNum.equals("602"))|| (findNum.equals("603")) || (findNum.equals ("604"))) {
		        		System.out.println("You have a Flow account!");
		        		 try
		 		        {
		 			    	File file = new File("Flow_Customers.txt");
		 		            FileReader fr = new FileReader(file);
		 		            BufferedReader bc = new BufferedReader(fr);
		 		          String line = null;
		 		            while ((line = bc.readLine()) != null) 
		 		            {
		 		                if (line.contains(number)) {
		 		                    System.out.println(line);
		 		                    
		 		            }
		 		                else if (line.equals(null)) {
		 		                	System.out.print("We can't seem to find your account");
		 		                }
		 		            }
		 		            fr.close();
		 		            bc.close();
		 		            
		 		              } catch (Exception ex) {
		 		            ex.printStackTrace();
		 		        }
		        	}
		        	else if((findNum.equals("301")) || (findNum.equals ("302")) || (findNum.equals("303")) || (findNum.equals ("304"))) {
		        		System.out.println("You have a Digicel account!");
		        	    try {
		        		File file = new File("Digicel_Customers.txt");
	 		            FileReader fr = new FileReader(file);
	 		            BufferedReader bc = new BufferedReader(fr);
	 		          String line = null;
	 		            while ((line = bc.readLine()) != null) 
	 		            {
	 		                if (line.contains(number)) {
	 		                    System.out.println(line); 
	 		                    bc = null;
	 		            }
	 		                else if(line.equals(null)) {
	 		                	System.out.println("We can't seem to find your account");
	 		                }
	 		            }
	 		            fr.close();
	 		            bc.close();
		        	
	 		              } catch (Exception ex) {
	 		            ex.printStackTrace();
	 		             }
		     }
		        	else {
		        		System.out.println("This is neither a Flow nor Digicel phone number");
		        	}


		    }
	}


 
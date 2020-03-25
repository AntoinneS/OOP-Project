package teleCom;
import java.util.*; 
import java.io.*;

public class Driver {
	
	private static Scanner antoinne;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			System.out.println("a) Administration");
			System.out.println(" \t i. Digicel");
			System.out.println("\t \t a) Display company information");
			System.out.println("\t \t b) Add customer");
			System.out.println("\t \t c) View customer base");
			System.out.println("\t \t d) Create phone credit");
			System.out.println("\t \t e) View all phone credit");
			System.out.println("\t ii. Flow");
			System.out.println("\t \t a) Display company information");
			System.out.println("\t \t b) Add customer");
			System.out.println("\t \t c) View customer base");
			System.out.println("\t \t d)Create phone credit");
			System.out.println("\t \t e)View all phone credit");
			System.out.println("\t iii. Display total number of customers");
			System.out.println("b) Customer");
			System.out.println("\t i.Add Credit");
			System.out.println("\t ii.Check Balance");
		
			String choice = null;
			String provider;
			String option;
			int x = 1;
			int count = 0;
			int x1= 1;
			int x2 =1;
			int x3 = 1;
			ServiceProvider pro;
			String digians;
			String flowans;
			String Digicelpass = "TheBiggerBetterNetwork2018";
			String Flowpass = "TheWayIFlow";
            boolean InputError = false;
            boolean InputError1 = false;
            
			antoinne = new Scanner(System.in);
			while(!InputError) {
				try {
					choice = antoinne.nextLine();
					InputError = true;
				} catch(InputMismatchException e) {
					System.out.println("Please enter a String");
					antoinne.next();
				}
			}
			
			switch(choice) {
			
			case "a":
				System.out.println("(ii)Flow, (i)Digicel or (iii) View Total Customers");
				provider = antoinne.nextLine();
					
					switch(provider) {
						
						case "ii":
							//try {
							do {
							System.out.println("Please enter the password to proceed");
							flowans = antoinne.nextLine();
							
							
							if (flowans.equals(Flowpass)) {
							x = 2;
							}
							
							else {
								System.out.println("Incorrect password selected, try again");
							}
							
							}while(x !=2 );
							
						
							do {
								System.out.println("\t \t a) Display company information");
								System.out.println("\t \t b) Add customer");
								System.out.println("\t \t c) View customer base");
								System.out.println("\t \t d) Create phone credit");
								System.out.println("\t \t e) View all phone credit");
							    option = antoinne.nextLine();
							  if (option.equals("a") || option.equals("b") || option.equals("c") || option.equals("d") || option.equals("e")) {
								 x1 = 2;
							  }
							  else {
								  System.out.println("Incorrect option selected");
							  }
							}while(x1 !=2);
							
							switch (option) {
								
								case "a":
									pro = new Flow();
									pro.DisplayInformation();
									//Flow Display = new Flow(x3, Flowpass, x3);
									//Display.DisplayInformation();
									Scanner pe = new Scanner (System.in);
									pe.nextLine();
                                    main(args);
                                    
								break;	
								case "b":
									pro = new Flow();
									pro.AddCustomer();
									//Flow Provider = new Flow(0, option, 0);
									//Provider.AddCustomer();
									main(args);
								break;
								case "c":
									pro = new Flow();
									pro.ViewCustomer();
									//Flow View = new Flow(0, option, 0);
									//View.ViewCustomer();
								break;
								case "d":
									PhoneCredit Credit = new PhoneCredit(Flowpass, x3, Flowpass, Flowpass, x3, Flowpass);
									Credit.FlowCreateCredit();
									Scanner pause = new Scanner (System.in);
									pause.nextLine();
                                    main(args);
                                    
								break;
								case "e":
									PhoneCredit ViewCredit = new PhoneCredit(Flowpass, x3, Flowpass, Flowpass, x3, Flowpass);
									ViewCredit.FlowViewCredit();
									Scanner ps = new Scanner (System.in);
									ps.nextLine();
                                    main(args);
								break;
								default:
							}
					break;
						
						case "i":
							
							do {
							System.out.println("Please enter the password to proceed");
							digians = antoinne.nextLine();
							
							if (digians.equals(Digicelpass)) {
							x = 2;
							}
							
							else {
								System.out.println("Incorrect password selected, try again");
							}
							
							}while(x == 1);
							 
						
							
							do {
								System.out.println("\t \t a) Display company information");
								System.out.println("\t \t b) Add customer");
								System.out.println("\t \t c) View customer base");
								System.out.println("\t \t d) Create phone credit");
								System.out.println("\t \t e) View all phone credit");
							    option = antoinne.nextLine();
							  if (option.equals("a") || option.equals("b") || option.equals("c") || option.equals("d") || option.equals("e")) {
								 x2 = 2;
							  }
							  else {
								  System.out.println("Incorrect option selected");
							  }
							}while(x2 !=2);
						
														
							switch (option) {
								
								case "a":
									pro = new Digicel();
									pro.DisplayInformation();
									//Digicel Display = new Digicel(x3, Flowpass, x3);
									//Display.DisplayInformation();
									Scanner pause = new Scanner (System.in);
									pause.nextLine();
                                    main(args);
                               
								break;	
								case "b":
									pro = new Digicel();
									pro.AddCustomer();
									//Digicel Provider = new Digicel(0, option, 0);
									//Provider.AddCustomer();
									main(args);
								break;
								case "c":
									pro = new Digicel();
									pro.ViewCustomer();
								//	Digicel View = new Digicel(0, option, 0);
									//View.ViewCustomer();
									Scanner pauser = new Scanner (System.in);
									pauser.nextLine();
									main(args);

								break;
								case "d":
									PhoneCredit Credit = new PhoneCredit(Flowpass, x3, Flowpass, Flowpass, x3, Flowpass);
									Credit.DigiCreateCredit();
									Scanner pa = new Scanner (System.in);
									pa.nextLine();
                                    main(args);
								break;
								case "e":
									PhoneCredit ViewCredit = new PhoneCredit(Flowpass, x3, Flowpass, Flowpass, x3, Flowpass);
									ViewCredit.DigiViewCredit();
									Scanner ps = new Scanner (System.in);
									ps.nextLine();
                                    main(args);
								break;
								default:
							}
							break;
						case "iii":
							try {
							FileInputStream fstream = new FileInputStream("Digicel_Customers.txt");
							BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
							String strLine;
							while ((strLine = br.readLine()) != null)   {
							  count++;
							}
							} catch(IOException ex) {
								System.out.println("Error with the file");
							}
							try {
								FileInputStream fstream = new FileInputStream("Flow_Customers.txt");
								BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
								String strLine;
								while ((strLine = br.readLine()) != null)   {
								  count++;
								}
								System.out.println("The total amount of customers are " + count);
								} catch(IOException ex) {
									System.out.println("Error with the file");
								}
							Scanner pa = new Scanner (System.in);
							pa.nextLine();
	                        main(args);
							break;
							default:
								System.out.println("Wrong input entered");
								main(args);
					}
					break;
					
			case "b":
				do {
					System.out.println("\t i.Add Credit");
					System.out.println("\t ii.Check Balance");
				    option = antoinne.nextLine();
				  if (option.equals("i") || option.equals("ii")) {
					 x3 = 2;
				  }
				  else {
					  System.out.println("Incorrect option selected");
				  }
				}while(x3 !=2);
				
				switch(option) {
					case "i":
						PhoneCredit add = new PhoneCredit(Flowpass, x3, Flowpass, Flowpass, x3, Flowpass);
						add.FlowAddCredit();
						Scanner paus = new Scanner (System.in);
						paus.nextLine();
                        main(args);
					
					break;
					case "ii":
						PhoneCredit balance = new PhoneCredit(Flowpass, x3, Flowpass, Flowpass, x3, Flowpass);
						balance.CheckBalance();
						Scanner pause = new Scanner (System.in);
						pause.nextLine();
                        main(args);
					break;
					default:
						System.out.println("Wrong input entered");
						Scanner pau = new Scanner (System.in);
						pau.nextLine();
                        main(args);
					
				}
				break;
				default:
					System.out.println("Wrong input entered");
					main(args);
			}
			
		}
}
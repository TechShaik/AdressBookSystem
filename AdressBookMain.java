package com.files;

import java.util.Scanner;

public class AdressBookMain {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

      System.out.println("Welcome to Adress Program");
      System.out.println();
    
         
        /// add here
         Adding ad=new Adding();
         
         Contacts p1=new Contacts("Tailor","Shaikshavali","BTM Layout","Banglore","Karnataka",560029,6303833290L,"shaiknaveed5811@gmail.com");
         Contacts p2=new Contacts("Ternekal","Shahid","Udipi","hyd","ap",568889,6281882610L,"sayyedshahid@gmail.com");

 
         ad.add(p1);
         ad.add(p2);       
         

         System.out.println("Select your operation:");
         System.out.println("Press 1 to edit contact");
         System.out.println("Press 2 to delete contact");
         System.out.println("Press 3 to view contacts");
         System.out.println("Press 4 to exit");

        int n=sc.nextInt();
        sc.nextLine();
        switch(n) {
       
        case 1:
        	
        	 System.out.println("Enter the first name");
	            String F_name=sc.nextLine();
	            
	            System.out.println("Enter the last name");
	            String l_name=sc.nextLine();
	            
	            ad.edit(F_name,l_name);  
	            
                ad.display();
      	            break; 
      	            
        case 2:
        	

       	 System.out.println("Enter the first name");
	            String F_nam=sc.nextLine();
	            
	            System.out.println("Enter the last name");
	            String l_nam=sc.nextLine();
	            ad.delete(F_nam, l_nam);
	            
                ad.display();	            
  	            break;
  	            
        case 3: 
        	
                      ad.display();
                         break;
                         
        case 4:
        	
        	System.out.println("Invalid Option");
            sc.close();
            break;
        	     }
      }
	
}

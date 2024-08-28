package com.files;
import java.util.*;
public class Adding {
	List<Contacts> con=new ArrayList<>();
	          

         public void add(Contacts p1) {
        	 con.add(p1);
         }
         
        //  for editing details
         
        	public void edit(String First_name,String Last_name) { 
        	 for(Contacts i : con) {
        		 if(i.getFirst_name().equalsIgnoreCase(First_name) && i.getLast_name().equalsIgnoreCase(Last_name)){
        			 
         			 Scanner sc=new Scanner(System.in);
         			  
        			 System.out.println("Enter new adress");
        			 i.setAdress(sc.nextLine());
        			 
        			 System.out.println("Enter new city");
        			 i.setCity(sc.nextLine());
        			 
        			 System.out.println( "Enter new state");
        			 i.setState(sc.nextLine());
        			 
        			 System.out.println("Enter new Zip: ");
                     i.setZip(sc.nextInt());
                     sc.nextLine();  

                     
                     System.out.println("Enter new Phone Number: ");
                     i.setPhone_number(sc.nextLong());
                     sc.nextLine();  

                     System.out.println("Enter new Email: ");
                     i.setE_mail(sc.nextLine());

                     System.out.println("Contact updated successfully!");
                     
        		 }
        			 
        		 System.out.println("Contact not found");
        	 }}
          
}
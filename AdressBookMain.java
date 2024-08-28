package com.files;

import java.util.Scanner;

public class AdressBookMain {

	public static void main(String[] args) {
      System.out.println("Welcome to Adress Program");
      System.out.println();
    
         Contacts p1=new Contacts("Tailor","Shaikshavali","BTM Layout","Banglore","Karnataka",560029,6303833290L,"shaiknaveed5811@gmail.com");
      
      
         Adding ad1=new Adding();
         ad1.add(p1);
         System.out.println(p1);
         
    	           
  	            Scanner sc=new Scanner(System.in);
  	            
  	            System.out.println("Enter the first name");
  	            String F_name=sc.nextLine();
  	            
  	            System.out.println("Enetr the last name");
  	            String l_name=sc.nextLine();
  	            
   	            ad1.edit(F_name,l_name);  
  	            
  	            System.out.println(p1);
 }
	

}

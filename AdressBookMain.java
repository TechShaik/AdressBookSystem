package com.files;

import java.util.Scanner;

public class AdressBookMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adding ad = new Adding();

        System.out.println("Welcome to Address Program");
        System.out.println();

        while (true) {
             System.out.println("Select your operation:");
            System.out.println("Press 1 to add new contact");
                System.out.println("Press 2 to edit contact");
            System.out.println("Press 3 to delete contact");
                 System.out.println("Press 4 to view contacts");
            System.out.println("Press 5 to exit");

            int n = sc.nextInt();
            sc.nextLine(); 

            switch (n) {
                case 1:
                    
                    while (true) {
                        System.out.println("Enter details for a new contact:");
                           System.out.println("Enter first name:");
                        String firstName = sc.nextLine();

                          System.out.println("Enter last name:");
                        String lastName = sc.nextLine();

                          System.out.println("Enter address:");
                        String address = sc.nextLine();

                            System.out.println("Enter city:");
                        String city = sc.nextLine();

                        System.out.println("Enter state:");
                           String state = sc.nextLine();

                        System.out.println("Enter zip code:");
                          int zip = sc.nextInt();
                         sc.nextLine(); 

                            System.out.println("Enter phone number:");
                          long phoneNumber = sc.nextLong();
                             sc.nextLine(); 
                        System.out.println("Enter email:");
                          String email = sc.nextLine();

                           Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
                        ad.add(contact);

                        System.out.println("Contact added successfully!");

                          System.out.println("Do you want to add another contact? (yes/no)");
                        String res = sc.nextLine();
                        if (!res.equalsIgnoreCase("yes")) {
                             break; 
                        }
                    }
                    break;

                case 2:
                     System.out.println("Enter the first name");
                    String F_name = sc.nextLine();

                    System.out.println("Enter the last name");
                    String l_name = sc.nextLine();

                    ad.edit(F_name, l_name);
                    ad.display();
                    break;

                case 3:
                     System.out.println("Enter the first name");
                    String F_nam = sc.nextLine();

                    System.out.println("Enter the last name");
                    String l_nam = sc.nextLine();

                    ad.delete(F_nam, l_nam);
                    ad.display();
                    break;

                case 4:
                     ad.display();
                    break;

                case 5:
                     System.out.println("Exiting the program.");
                    sc.close();
                    return;  

                default:
                    System.out.println("Invalid Option Exiting the program.");
                    sc.close();

                    break;
            }
        }
    }
}

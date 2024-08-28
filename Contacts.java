package com.files;

public class Contacts {

	 
                   private String First_name;
               private  String Last_name;
               private  String Adress;
               private String City;
                private  String State;
                int zip;
                long Phone_number;
                private String E_mail;
                
                public Contacts(String First_name, String Last_name, String Adress, String City, String State, int zip, long Phone_number, String E_mail) {
                    this.First_name = First_name;
                    this.Last_name = Last_name;
                    this.Adress = Adress;
                    this.City = City;
                    this.State = State;
                    this.zip = zip;
                    this.Phone_number = Phone_number;
                    this.E_mail = E_mail;
                	
                }
                
                
                
                public String toString(){
					System.out.println("Adress >>>>>>>");
					System.out.println("First_name : "+First_name);
					System.out.println("Last_name : "+Last_name);
					System.out.println("Adress : "+Adress);					
					System.out.println("City : "+City);
					System.out.println("State : "+State);
				System.out.println("zip : "+zip);
					System.out.println("Phone_number : "+Phone_number); 
					System.out.println("E_mail : "+E_mail);
					return "";
 
                 }
 


				public void setFirst_name(String first_name) {
					First_name = first_name;
				}



				 
				public void setLast_name(String last_name) {
					Last_name = last_name;
				}



				 
				public void setAdress(String adress) {
					Adress = adress;
				}


             	public void setCity(String city) {
					City = city;
				}



				 public void setState(String state) {
					State = state;
				}



				 public void setZip(int zip) {
					this.zip = zip;
				}



				 public void setPhone_number(long phone_number) {
					Phone_number = phone_number;
				}



				 public void setE_mail(String e_mail) {
					E_mail = e_mail;
				}



				public String getFirst_name() {
					return First_name;
				}



				public String getLast_name() {
					return Last_name;
				}



			 
				}

 				
				
                
	



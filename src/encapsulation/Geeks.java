package encapsulation;


//Java Program which demonstrate Encapsulation

 
 // Private data members (encapsulated)


 // Public getter and setter methods (controlled access)

//Main Class
public class Geeks 
{
	public static void main(String[] args) {
		Account acc = new Account(); 

	     // Set values using setter methods (controlled access)
	     acc.setAccNo(90482098491L);
	     acc.setName("ABC");
	     acc.setEmail("abc@gmail.com");
	     acc.setAmount(100000f);

	     // Get values using getter methods
	     System.out.println("Account Number: " + acc.getAccNo());
	     System.out.println("Name: " + acc.getName());
	     System.out.println("Email: " + acc.getEmail());
	     System.out.println("Amount: " + acc.getAmount());
		
	}
 
     // Create an Account object
     
 }



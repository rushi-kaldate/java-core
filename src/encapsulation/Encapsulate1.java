package encapsulation;

public class Encapsulate1 {
	public static void main(String[] args)
	 {
	     Encapsulate o = new Encapsulate();

	     // setting values of the variables
	     o.setGeekName("Geeta");
	     o.setGeekAge(19);
	     o.setGeekRoll(51);

	     // Displaying values of the variables
	     System.out.println("Geek's name: " + o.getGeekName());
	     System.out.println("Geek's age: " + o.getGeekAge());
	     System.out.println("Geek's roll: " + o.getGeekRoll());

}
}

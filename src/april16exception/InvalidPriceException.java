package april16exception;

public class InvalidPriceException extends RuntimeException {

	@Override
	public String toString() {
		return "InvalidPriceException : this is not negative values";
	}
	
	

}

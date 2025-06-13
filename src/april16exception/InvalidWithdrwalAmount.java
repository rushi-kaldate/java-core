package april16exception;

public class InvalidWithdrwalAmount extends RuntimeException{
	
	@Override
	public String toString() {
		return "InvalidWithdrwalAmount :-(";
	}

}

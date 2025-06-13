package abc25;

// find the array in greteast value in 20;
public class ClientC {
	public static void main(String[] args) {
		int b[] = {56,34,23,14,5,122};
	    int sum = 0;
		for(int i = 0; i<b.length; i++) {
	    	if(b[i]>20) 
	    		sum = sum + b[i];
	    	
	    }
		System.out.println("sum  "+sum);
	}

}

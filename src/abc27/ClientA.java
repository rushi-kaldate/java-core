package abc27;

public class ClientA {
	public static void main(String[] args) {
		char a[] = {'h','e','l','l','o'};
		
//		
		for(int i= 0; i<a.length/2; i++) {
		char t = a[i];
		a[i] = a[a.length-i-1];
		a[a.length-i-1] = t;
		}
		for(int i = 0; i < a.length ;i++ ) {
			System.out.println(a[i]);
		}
		
	}

}

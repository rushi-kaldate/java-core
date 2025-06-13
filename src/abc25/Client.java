package abc25;

//sum of elements in array
public class Client {
	public static void main(String[] args) {
		
		int a[] = {60,50,40,30,20,10};
		
		int sum = 0;
		for(int i = 0; i<a.length;i++)
			sum = sum + a[i];
		System.out.println(sum);
	}

}

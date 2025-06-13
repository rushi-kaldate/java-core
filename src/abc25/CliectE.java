package abc25;

// find sum of even elements in an array
public class CliectE {
	public static void main(String[] args) {
//		int x[]= {40,50,25,34,14,45,67};
//		int sum = 0;
//		for(int i=0; i<x.length;i++)
//			if(x[i] % 2 ==0) {
//				sum =sum + x[i];
//			}
//		System.out.println("sum " +sum);
		
		int x[]= {40,50,25,34,14,45,67};
		int sum= 0;
		for(int i=0;i<x.length;i++)
			if(x[i]% 2 !=0) {
				sum =sum + x[i];
			}
		System.out.println("sum " +sum);
	}

}

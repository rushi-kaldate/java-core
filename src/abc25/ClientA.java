package abc25;

//print all sum the numbers which are in range of 30 to 50
public class ClientA {
	public static void main(String[] args) {
//		int z[]= {45,2,23,35,6,42,31,67};
//		for(int i=0;i<z.length;i++)
//			if(z[i]>=30 && z[i]<=50)
//		        System.out.println(z[i]);
		
		int x[]= {45,2,23,35,6,42,31,67};
		int sum =0;
		for(int i=0;i<x.length;i++)
			if(x[i]>=30 && x[i]<=50) {
				sum = sum + x[i];
			}
		System.out.println("sum "+sum);

	}

}

package abc25;

public class Practice25 {
	public static void main(String[] args) {
//		int a[] = {23,34,45,56,53,78,23};
//		for(int i=0;i<a.length/2;i++) {
//			int t = a[i];
//			a[i] = a[a.length-i-1];
//			a[a.length-i-1] = t;
//		}
//		for(int i=0;i<a.length;i++)
//			System.out.println(a[i]);
		
//		int a[] = {23,45,67,67,21,33};
//		for(int i=a.length-1;i>=0;--i)
//			System.out.println(a[i]);
		
//		char a[]= {'h','e','l','l','o','n','i','l','e','s','h'};
//		char target = 'l';
//		int counter = 0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i] == target)
//				counter++;
//		}
//		System.out.println("counter" + counter);
		
		
//		int a[]= {12,13,14,15,16,17,18,19,20};
//		int sum = 0;
//		for(int i=0;i<a.length;i++)
//			sum =sum + a[i];
//		System.out.println(sum);
		
		int a[]= {12,13,14,15,16,17,18,19,20};
		//int sum =0;
		//for(int i=a.length-1;i>=0;--i)
		for(int i=0;i<a.length;i++)
			if(a[i] % 2==0)
				//sum =sum + a[i];
		System.out.println(a[i]);
		
	}

}

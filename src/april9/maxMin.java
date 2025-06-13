package april9;

public class maxMin {
	public static void main(String[] args) {
		int number[] = {10,20,30,40,50,60,7,80,70};
		int max = number[0];
		int min = number[0];
		for(int num : number) {
			if(num>max) {
				max = num;
			}
			else if(num<min){
				min= num;		
			}

		}
		System.out.println("maximum :"+max);
		System.out.println("minimum :"+min);


	}

}

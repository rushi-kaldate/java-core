package abc25;

public class ClientB {
	public static void main(String[] args) {
		float marks[] = {80.80f,78.80f,56.40f,71.14f,45.50f};
		
		float sum = 0;
		for(int i = 0;i<marks.length;i++)
			sum =sum +marks[i];
		System.out.println(sum);
	}

}

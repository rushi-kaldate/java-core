package abc25;

//count frequency of given character
// find the character in l
public class I {
	public static void main(String[] args) {
		char t[] = {'h','e','l','l','o','n','i','l','e','s','h'};
		char target = 'l';
		for(int i=0;i<t.length;i++)
			if(t[i] ==target) {
				System.out.println("Find the index :"+i);
			}
	}

}

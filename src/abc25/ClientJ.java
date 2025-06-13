package abc25;

//reverse order in character
public class ClientJ {
	public static void main(String[] args) {
		char ch[] = {'h','e','l','l','o'};
		for(int i=0;i<ch.length/2;i++) {
			char t= ch[i];
			ch[i] = ch[ch.length-i-1];
			ch[ch.length-i-1] = t;
		} 
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
	}

}

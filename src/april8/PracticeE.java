package april8;
/*Section  72   2 years
 * Section 55   7 years
 * Section 70   20 years
 * Section 187  7 years
 * Section 226  1 years
 */
public class PracticeE {

	int sample(int section) {
		int p =0;
		switch(section) {
		case 72:
			p += 2;
			break;
		case 55:
			p +=7;
			break;
		case 70:
			p +=20;
			break;
		case 187:
			p+=7;
			break;
		case 226:
			p+=1;
			break;
		}
	
		return p;
	}


	int calpunishment(int section) {
		return sample(section);	
	}
	int calpunishment(int section1,int section2) {
		return sample(section1)+sample(section2);
	}
	int calpunishment(int section1,int section2,int section3) {
		return sample(section1)+sample(section2)+sample(section3);
	}
	
	int calpunishment(int section[]) {
		int p=0;
		for(int i=0;i<section.length;i++)
			p = p+sample(section[i]);
		return p;
	}
}



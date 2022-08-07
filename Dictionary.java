
public class Dictionary {
	
	private int nxt;
	
	public Dictionary(int number) {
		nxt = number;
	}

	
	public String getWord(int index) {
		switch (index) {
		case 0: return "UNIVERSITY";
		case 1: return "COMPUTER";
		case 2: return "LAPTOP";
		case 3: return "HEADPHONES";
		case 4: return "FUZZY";
		case 5: return "DOG";
		case 6: return "KEYHOLE";
		case 7: return "TELEPHONE";
		case 8: return "PRINTER";
		case 9: return "BUILDING";
		case 10: return "FRINGE";
		case 11: return "CHAIR";
		case 12: return "PENCIL";
		case 13: return "FROG";
		case 14: return "CAR";
		case 15: return "CLOCK";
		case 16: return "STAR";
		case 17: return "LAKE";
		case 18: return "ADVENTURE";
		case 19: return "WINDOW";
		case 20: return "SUGAR";
		
		default: return "Illegal index";
		}
	}
}

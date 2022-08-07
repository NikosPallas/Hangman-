import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		String game_choice;
		char next_letter;
	    int  guesses = 8;
	    String Word="";
	    int gamesPlayed = 0;
	    int gameWins = 0;
	    int gameLosts = 0;

		boolean game = true;
		
		while(game) {
		
		    System.out.println("MAIN MENU");
	    	System.out.println("- Start a new game");
	    	System.out.println("- Statistics (S)");
	    	System.out.println("- Exit (E)");
	    	System.out.println("Please enter your choice: ");
	    
	    	Scanner in = new Scanner(System.in);
			game_choice = in.next();
	    	
	    if(game_choice.equalsIgnoreCase("s")) {
	    	System.out.println("You have played so far " + gamesPlayed + " games. You won "  + gameWins + " times and lost "  + gameLosts + " times.");
	      }
	    
	    if (game_choice.equalsIgnoreCase("e")) {
	    	game = false;
	    	System.out.println("Bye!");	
	      }
	    
		
	    
	    if(game) {
	    
		Random ran = new Random(); //Παραγωγή //
		int nxt = ran.nextInt(21);  //τυχαίου αριθμού//
		
		Dictionary RandomWord = new Dictionary(nxt);
		
		Word= RandomWord.getWord(nxt); //Επιλογή τυχαίας λέξης μέσω του τεχνητού μας λεξικού//
		
        char[] UnknownWord = new char [Word.length()];

        {
 	    int i=0;
	    while(i<Word.length()) {
		UnknownWord[i]='-';
	    
	    i++;
	     }
		
	   System.out.print("The random word is now: ");
	   System.out.println(UnknownWord);
	   
	
        Scanner letter = new Scanner(System.in);
				
		int Complete = 0;
		int CorrectGuesses = 0;
		int WrongGuesses = 0;
		
		while(guesses>0 && Complete!=Word.length() ) {
			
			System.out.println("You have " + guesses + " guesses left");

			System.out.println("Your guess:" );
			next_letter = in.next().charAt(0);
			
			boolean b1;
			
			b1 = Character.isLetter(next_letter); //Περιορισμός για αποδοχή μόνο γραμμάτων //
			
			boolean LowerCase = false;
			
			if(b1) {
				
				LowerCase = Character.isLowerCase(next_letter);
				
			   if(LowerCase) {
				   next_letter = Character.toUpperCase(next_letter);
			   }
	//	 for(int j=0;j<Word.length();j++) {//
			
		//    if(next_letter==UnknownWord[j]){	//
			   
			//    UnknownWord[j]= next_letter;	//
			    
			 //    flag=true;   //
		        
		       //                 }//
		    
		          //            }//
			
			boolean flag=false;

			if(Word.contains(next_letter + "")) {
				
				flag=true;

				
				for(int y=0; y<Word.length();y++) {
					if(Word.charAt(y)==next_letter)
					{
						UnknownWord[y]=next_letter;
						Complete++;
					}
				}
				
			}
			
			else {
				flag=false;
			}
			
			
		 
		 if(flag==true) {
			 
		    CorrectGuesses ++;
		    System.out.println("The guess is correct!");
            System.out.println(UnknownWord);

		      }
		 else
		  {
			   guesses--;
			   WrongGuesses ++;
			   System.out.println("There are no " + next_letter + "'s" + " in the word.");
		      
		  }
		       		  
			     }
			
			
			     else {
				     System.out.println("Your guess is not a letter");
			       }
		 
		         }
		if(guesses>0) {
			System.out.println("Congratulations! You guessed the word: " + Word);
			System.out.println("You made " + CorrectGuesses + " correct guesses and " + WrongGuesses  + " wrong guesses." );
			gamesPlayed++;
			gameWins++;
		   }
		
		else {
			gamesPlayed++;
			gameLosts++;
		 }
		
        }
        
        
        

	     }
	}
  }
}


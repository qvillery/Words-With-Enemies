import java.util.Scanner;
public class wordsWithEnemies {
	
	static String leftWord;
	static String rightWord;
	 
	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two words to do battle!");
		leftWord = scan.next();
		rightWord = scan.next();
		scan.close();
		compareWords();
		whoWon();
	}
	
	
	
	public static void compareWords ()
	
	{
		int length = leftWord.length();
		char letter;
		
		for (int i = length -1; i >= 0; i-- )
		{
			letter = leftWord.charAt(i);
			
			if (rightWord.indexOf(letter) > -1)
			{
				leftWord = leftWord.replaceFirst(letter + "", "");
				rightWord = rightWord.replaceFirst(letter + "", "");
			}
		}
	}
	
	public static void whoWon()
	{
		
		if (leftWord.length() > rightWord.length())
		{
			System.out.println("Left word won with " + leftWord + "!");
		}
		
		else if (leftWord.length() < rightWord.length())
		{
			System.out.println("Right word won with " + rightWord + "!");
		}
		
		else if (leftWord.length() == rightWord.length())
		{
			System.out.println("It's a tie with words having " + leftWord + " " + rightWord + "!");
		}
	}

}

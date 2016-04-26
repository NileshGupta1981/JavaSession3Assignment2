import java.util.Scanner;

public class Session3Assignment2{
	
	public static void main (String args[]) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println ("Enter the number to check for prime");
		int num = scnr.nextInt();
		String result = checkprime(num);
		System.out.println ("The given number is "+result);
		scnr.close();
	}
	
	public static String checkprime (int number)
	{
		
		if (number ==1){
			return "Prime";
		}
		
		int i ;
	for (i = 2 ; i <= number ; i++ )
	{
		if ( number%i ==0)
		{
			if (number == i)
			{
				return "Prime";
			}
			return "Not Prime";
			
		}
	}
	return "not a valid entry";
	
	}
}
import java.util.*;
	public class fivefourteen
	{
		private static Scanner input;

		public static void main(String[] args)
		{
			input = new Scanner(System.in);
			
			System.out.println("Please enter two positive integers: ");
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			int gcd = 0;
			
			for(int x = 1; x <= Math.max(n1, n2); x++)
			{
				if(n1 % x == 0 && n2 % x == 0)
				{
					gcd = x;
				}
			}
			System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");
		}
	}


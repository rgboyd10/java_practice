public class fivetwenty
{
	public static void main(String[] args)
	{
		int counter = 0;
		for(int x = 2; x <= 1000; x++)
		{
			
			if(x % 2 != 0 && x % 3 != 0 && x % 5 !=0)
			{
			System.out.print(x + " ");
			
			counter++;
			
				if(counter % 8 == 0)
				{
				System.out.println();
				}
			}
		}
	}
}
public class fiveeighteen {
  /** Print Pattern I */
  public static void main(String[] args) {
    System.out.println("Pattern A");
	for (int i = 1; i <= 6; i++) 
    {
      for (int j = 1; j <= i; j++)
        {

    		  System.out.print(j + " ");
        }
      System.out.println();
    }
    
    System.out.println("Pattern B");
    for (int i = 6; i >= 1; i--) 
    {
      for (int j = 1; j <= i; j++)
        {

    		  System.out.print(j + " ");
        }
      System.out.println();
    }
    
    System.out.println("Pattern C");
    for(int i = 1; i <= 6; i++)
    {
    	for(int j = 1; j <= i; j++)
    	{
    		System.out.printf("%-4d", j);
    	}
    System.out.println();
    }
  }
}

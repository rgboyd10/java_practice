class BetterBoxed
{
	double width;
	double height;
	double depth;
	
	
	BetterBoxed()
	{
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	//compute and return volume
	double volume()
	{
		return width * height * depth;
	}
	
	//sets dimensions of box
	void setDim(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}
}

class BoxDemo6
{
	public static void main(String args[])
	{ //declare, allocate, and initialize Box objects
		BetterBoxed mybox1 = new BetterBoxed();
		BetterBoxed mybox2 = new BetterBoxed();
		double vol;
		
		//initializes each box
		mybox1.setDim(10, 20, 15);
		mybox2.setDim(3, 6, 9);
		
		//get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		//get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}
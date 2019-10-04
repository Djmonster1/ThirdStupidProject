package third.controller;


//Need to import popup since its in a different package
import third.view.Popup;


public class Controller
{

	private Popup view;
	
	public Controller()
	{
		view = new Popup();
	}
	
	
	
	public void start()
	{
		
		loopTest();
		
//		System.out.println("Batman is the Dark Knight");
//		System.out.print("Huey is the best Boondocks character");
//		System.out.println(" Black Magick");
	
	}
	
	private void loopTest()
	{
		//Simon says do something and stop when simon says stop
		//AKA while loop
	
		//Step 1: Define a variable
		boolean isFinished = false;
		
		int count = 0;
		//Step 2: Test the variable
		while(isFinished)
		{
			//Set 3: Do things
			System.out.println("Words on the screen" + count);
			count++;
			
			if (count > 130)
			{
				isFinished = true; //Step 4!! Make stopping point!
			}
		}
		
		System.out.println("Count is at: " + count);
		
		while (count > 0)
		{
			System.out.println(count);
			count--;
		}
	
		int special = 1;
		do
		{
			System.out.println(special);
			special--;
		}while (special > 0);
		
		for(int spot = 0; spot <100; spot ++)
		{
			System.out.println("Spot is: " + spot);
		}
	
		//Spot is not visible anymore
	
	}
}
















//BubbleSort Algorithm
public class BubbleSort extends PapaSort
{
	public BubbleSort(int [] l, String sortName)
	{
		super(l, sortName);
	}
	
	//Comparing and changing it
	private boolean bubbleIt(int end)
	{
			boolean didSwap = false;
			for(int i = 0; i < end; i++)
			{
				if(super.getElement(i) > super.getElement(i+1))
				{
					super.swap(i+1, i);
					didSwap = true;
				}
			}
			return didSwap;
	}
	
	@Override
	public void executeAlgorithm()
	{
		boolean notDone = true;
		int bubbleEnd = super.getList().length-1;
		do
		{
			notDone = bubbleIt(bubbleEnd);
			if(notDone)
			{
				bubbleEnd -= 1;
			}
		}
		while(notDone && bubbleEnd >= 1);
	}
}

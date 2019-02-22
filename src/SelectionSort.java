//SelectionSort algorithm
public class SelectionSort extends PapaSort
{
	//Data in superclass --- PapaSort
	public SelectionSort(int[] l, String sortName)
	{
		super(l, sortName);
	}
	
	@Override
	public void executeAlgorithm()
	{
		for(int j = 0; j < super.getList().length-1; j++)
		{
			int biggest = super.getElement(0);
			int bigLoc = 0;
			
			for(int i = 0; i < super.getList().length-j; i++)
			{
				if(biggest < super.getElement(i))
				{
					biggest = super.getElement(i);
					bigLoc = i;
				}
			}
			swap(bigLoc, super.getList().length-1-j);
		}
	}
}

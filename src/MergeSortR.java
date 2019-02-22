public class MergeSortR extends PapaSort
{
	public MergeSortR(int[] l, String sortName)
	{
		super(l, sortName);
	}

	@Override
	public void executeAlgorithm()
	{
		mergeSort(0, this.getLength()-1);
	}
	
	public void mergeSort(int lS, int lE)
	{
		int lM = (lS + lE)/2;
		if(lE > lS)
		{	
			mergeSort(lS, lM);
			mergeSort(lM+1, lE);
			merge(lS, lM, lM+1, lE);
		}
	}
	
	private void merge(int start1, int end1, int start2, int end2)
	{
		int s1 = start1;
		int s2 = start2;

		int[] temp = new int[(end1-start1 + 1) + (end2-start2 + 1)];
		int tPointer = 0;
		
		while(s1 <= end1 && s2 <= end2)
		{
			if(this.getElement(s1) <= this.getElement(s2))
			{
				temp[tPointer] = this.getElement(s1);
				s1++;
			}
			else
			{
				temp[tPointer] = this.getElement(s2);
				s2++;
			}
			tPointer++;
		}
		for(int tp = tPointer; tp < temp.length; tp++)
		{
			if(s1 <= end1)
			{
				temp[tp] = this.getElement(s1);
				s1++;
			}
			else
			{
				temp[tp] = this.getElement(s2);
				s2++;
			}
		}
		for(int i = start1, t = 0; i <= end2; i++, t++)
		{
			this.setElement(i, temp[t]);
		}
	}
}

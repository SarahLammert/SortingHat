public class MergeSortNR extends PapaSort
{
	public MergeSortNR(int[] l, String sortName)
	{
		super(l, sortName);
	}

	@Override
	public void executeAlgorithm()
	{
		int b = this.getLength()-1;
		for(int j = 1, e = 0; Math.pow(2.0, (double)(e)) <= this.getLength(); j*=2, e++)
		{
			for(int a = 0; a <= b; a += j*2)
			{
				if(a+((j*2)-1 ) < this.getLength())
				{
					merge(a, a+j-1, a+j, a+((j*2)-1));
				}
				else
				{
					merge(a, a+j-1, a+j, b);
				}
			}
		}
	}
	
	private void merge(int start1, int end1, int start2, int end2)
	{
		
		int s1 = start1;
		int s2 = start2;
		
		//Temp arrray
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

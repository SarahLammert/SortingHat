//Making the array of elements
public class SortingHat
{
	//The main method
	public static void main(String [] args)
	{
		//Determines how many #s we want
		int howMany = 100000;

		//Building our arrays to test
		int[] nums0 = getDescendingOrder(howMany);
		int[] nums1 = nums0.clone();
 		int[] nums2 = nums0.clone();

		SelectionSort sSort = new SelectionSort(nums0, "SelectionSort");
		doTiming(sSort);
		
		System.out.println("");
		
		BubbleSort bSort = new BubbleSort(nums1, "BubbleSort");
		doTiming(bSort);
		
		System.out.println("");
		
		InsertionSort iSort = new InsertionSort(nums2, "InsertionSort");
		doTiming(iSort);
		
	}
	
	public static void doTiming(PapaSort s)
	{
		if(s.getLength() <= 100)
		{
			long start0 = System.nanoTime();
			
			s.executeAlgorithm();
			
			long end0 = System.nanoTime();
			long theTime0 = end0 - start0;
			
			System.out.println("Time for " + s.getSortName() + " on " + s.getLength() + " numbers is: " + theTime0 + " nanoseconds");
			
			System.out.println("");
			
			System.out.println(s);
		}
		else
		{
			long start1 = System.currentTimeMillis();
			
			s.executeAlgorithm();
			
			long end1 = System.currentTimeMillis();
			long theTime1 = end1 - start1;
			
			System.out.println("Time for " + s.getSortName() + " on " + s.getLength() + " numbers is: " + theTime1 + " milliseconds");

		}
	}
	
	//Method for filling list with random numbers
	public static int[] getRandom(int n)
	{
		int [] nList = new int[n];
		for(int i = 0; i < nList.length; i++)
		{
			nList[i] = (int)(Math.random() * 1000);
		}
		
		return nList;
	}
	
	public static int[] getAscendingOrder(int n)
	{
		int[] nList = new int[n];
		for(int i = 0; i < nList.length; i++)
		{
			nList[i] = i+1;
		}
		
		return nList;
	}
	
	public static int[] getDescendingOrder(int n)
	{
		int[] nList = new int[n];
		for(int i = 0; i < nList.length; i++)
		{
			nList[i] = nList.length - i;
		}
		
		return nList;
	}
}

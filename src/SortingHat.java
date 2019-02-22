//Making the array of elements
public class SortingHat
{
	//The main method
	public static void main(String [] args)
	{
		//Determines how many #s we want
		int howMany = 50;
		
		//int[] nums1 = getDescendingOrder(howMany);
 		int[] nums2 = getRandom(howMany);
 		//int[] nums3 = nums1.clone();
 		//int[] nums4 = nums1.clone();
 		int[] nums5 = getDescendingOrder(howMany);
		
 		/*
		SelectionSort sSort = new SelectionSort(nums1, "SelectionSort");
		doTiming(sSort);

		System.out.println("");
		
		*/
		BubbleSort bSort = new BubbleSort(nums2, "BubbleSort");
		doTiming(bSort);
		
		//System.out.println("");
		
		/*
		
		InsertionSort iSort = new InsertionSort(nums3, "InsertionSort");
		doTiming(iSort);
		
		System.out.println("");
		
		MergeSortNR mNRSort = new MergeSortNR(nums4, "MergeSort Non-Recursive");
		doTiming(mNRSort);
	
		*/
		
		System.out.println("");
		
 		MergeSortR mRSort = new MergeSortR(nums5, "MergeSort Recursive");
 		doTiming(mRSort);
		
 		System.out.println("");
 		
 		if(checkList(nums5))
 		{
 			System.out.println("I checked new list and its good");
 		}
 		else
 		{
 			System.out.println("Something is wrong");
 		}
 		
 		
	}
	
	public static void doTiming(PapaSort s)
	{
		if(s.getLength() <= 100)
		{
			System.out.println(s);
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
	
	public static boolean checkList(int[] l)
	{
		
		boolean b = true;
		for(int i = 0; i < l.length-1; i++)
		{
			if(l[i] > l[i+1])
			{
				b = false;
				break;
			}
		}
		return b;
	}
}

//Importing arrays
import java.util.Arrays;

//Parent class of algorithms
public abstract class PapaSort
{
	//Data hiding
	private int [] myList;
	private String whichSort;
	
	public PapaSort(int [] l, String sortName)
	{
		myList = l;
		whichSort = sortName;
	}
	public void swap(int place1, int place2)
	{
		int temp = myList[place2];
		myList[place2] = myList[place1];
		myList[place1] = temp;
	}
	
	//Getting the interface to get the string
	public String toString()
	{
		String s = "";
		s += whichSort + ": ";
		s += Arrays.toString(myList);
		return s;
	}
	
	//Getting the interface to get the list
	public int [] getList()
	{
		return myList;
	}
	
	//Adding additional interface to get numbers
	public int getElement(int whichE)
	{
		return myList[whichE];
	}
	
	public void setElement(int whichE, int val)
	{
		myList[whichE] = val;
	}
	
	public int getLength()
	{
		return myList.length;
	}
	
	public String getSortName()
	{
		return whichSort;
	}
	public abstract void executeAlgorithm(); //No curly braces
}

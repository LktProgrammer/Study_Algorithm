
public class Main {
	public static void main(String[] args)
	{
		int data[] = new int[] {1,2,3,4,5};
		Heap heap = new Heap(data,5);
		heap.Heap_Sort();
		
	}

}
/*Sorting sort = new Sorting();
sort.Shell_Sort(data,data.length);
for(int i=0;i<data.length;i++)
{
	System.out.print(data[i]+",");

}*/



public class Heap {
	private int Heap_Size;
	private int data[];
	
	public Heap(int[] data,int Heap_Size)
	{
		this.Heap_Size = Heap_Size;
		this.data = data;
	}
	public void Heap_Sort()
	{
		for(int i=Heap_Size/2;i>=0;i--)
		{
			Max_Heapify(i);
		}
		for(int i=0;i<data.length;i++)
		{
			System.out.println(DownHeap());
		}
	}
	public void Max_Heapify(int i)
	{
		int left_node= i*2+1;
		int right_node = i*2+2;
		int Max;

		if(left_node < Heap_Size)
		{
			if(data[left_node]>data[i])
			{
				Max = left_node;
			}
			else
			{
				Max = i;
			}
		}
		else
		{
			return;
		}
		if(right_node < Heap_Size)
		{
			if(data[right_node]>data[Max])
			{
				Max = right_node;
			}
		}
		if(Max != i)
		{
			Swap(Max,i);
			Max_Heapify(Max);
		}
	}
	public int DownHeap()
	{
		int max = data[0];
		data[0] = data[--Heap_Size];
		Max_Heapify(0);
		return max;
	}
	public void Swap(int Max,int i)
	{
		int tmp = data[Max];
		data[Max] = data[i];
		data[i] = tmp;
	}
}
